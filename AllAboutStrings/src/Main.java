public class Main {

    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World")); // indexOf()

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l')); // lastIndexOf()

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',
                3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',
                8));

        String helloWorldLower = helloWorld.toLowerCase(); // toLowerCase()
        if (helloWorld.equals(helloWorldLower)) { // equals()
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) { // equalsIgnoreCase()
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) { // startWith()
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) { // endsWith()
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) { // contains()
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World")) { // contentEquals()
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) { // isEmpty()
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) { // isBlank()
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0)); //charAt()

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
