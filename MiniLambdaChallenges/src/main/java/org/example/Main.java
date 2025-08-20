package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Assignment of anonymous class implementing Consumer<String>
        Consumer<String> printTheParts =  new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        printTheParts.accept("axle cam-shaft wheel");
        System.out.println();

        // Assignment of lamdba targeting abstract method accept
        printTheParts = s -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printTheParts.accept("bolt rod piston");
        System.out.println();


        Consumer<String> printThePartsConcise = s -> Arrays.asList(s.split(" ")).forEach(w -> System.out.println(w));
        printThePartsConcise.accept("lots more parts");
        System.out.println();

        UnaryOperator<String> unaryOperator = s -> {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                if (i%2 == 1) {
                    sb.append(s.charAt(i));
                }
            }

            return sb.toString();

        };

        System.out.println(unaryOperator.apply("1234567890"));
        System.out.println(everySecondChar(unaryOperator, "1234567890"));
        System.out.println();

        // Write a lambda that supplies "I love Java"
        Supplier<String> supplier = () -> "I love Java";
        System.out.println(supplier.get());
        System.out.println();

        // Create an array of names
        String[] names = new String[] {"Alex", "Anna", "Bob"};

        // Use array backed list to replace all names with uppercase
        // Arrays.setAll(names, i -> names[i].toUpperCase());
        Arrays.asList(names).replaceAll(n -> {
            n = n.toUpperCase();
            // create a variable holding reverse of name
            String reversed = new StringBuilder(n).reverse().toString();
            n = n + " " + (char)(new Random().nextInt(90 - 65 + 1) + 65) + ". " + reversed;
            System.out.println(n);
            return n;
        });

        // Can't remove due to fixed size of backing array
        // So convert to ArrayList, remove, and convert back to Array
        List<String> names_list = new ArrayList<>(List.of(names));
        names_list.removeIf(s -> {
            String lastName = s.split(" ")[2];
            return lastName.charAt(0) == lastName.charAt(lastName.length()-1);
        });
        names = names_list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

        demoMethodReferences();

    }
    // Write a function that takes the lambda as an argument
    public static String everySecondChar(UnaryOperator<String> unaryOperator, String theString) {
        return unaryOperator.apply(theString);
    }

    // Write as a lambda
    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();

        for (int i=0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }

        return returnVal.toString();
    }

    public static void demoMethodReferences() {
        String[] names = new String[] {"Alex", "Anna", "Bob"};
        List<UnaryOperator<String>> operatorList = new ArrayList<>();
        
        operatorList.add(String::toUpperCase);
        operatorList.add(s -> s + " " + randomChar('A', 'Z') + ".");
        operatorList.add(s -> {
            String reversed = new StringBuilder(s.split(" ")[0]).reverse().toString();
            return s + " " + reversed;
        });

        for(var operator: operatorList) {
            Arrays.asList(names).replaceAll(operator);
        }

        System.out.println(Arrays.asList(names));
;    }

    public static char randomChar(char a, char b) {
        return (char) new Random().nextInt((int) a, (int) b);
    }
}