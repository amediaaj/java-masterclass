package org.example;

import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        boolean flag = true;

        while(flag) {
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list");
            System.out.println("2 - to remove item(s) to list");

            flag = switch(Integer.parseInt(scanner.nextLine())) {
                case 1 -> {
                    arrayList =  addItems(arrayList);
                    yield true;
                }
                case 2 -> {
                    removeItems(arrayList);
                    yield true;
                }
                default -> false;
            };

            arrayList.sort(Comparator.naturalOrder());
            System.out.println(arrayList);
        }
    }

    private static ArrayList<String> addItems(ArrayList<String> groceries) {
        String[] groceryItems = (scanner.nextLine()).split(", ");
        groceries.addAll(List.of(groceryItems));
        Set<String> grocerySet = new HashSet<>(groceries);
        // Must return a new ArrayList since we are modifying
        return new ArrayList<>(grocerySet);
    }

    private static void removeItems(ArrayList<String> groceries) {
        String[] groceryItems = (scanner.nextLine()).split(", ");
        groceries.removeAll(List.of(groceryItems));
    }
}