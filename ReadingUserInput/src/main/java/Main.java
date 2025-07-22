import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // parse int
//        int currentYear = 2025;
//        String userDateOfBirth = "2019";
//        int dateOfBirth = Integer.parseInt(userDateOfBirth);
//        System.out.println("Age = " + (currentYear - dateOfBirth));

        //  parse double
//        String userAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("User says he is " + ageWithPartialYear);

        // input

//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch(NullPointerException e) {
//            System.out.println(getInputFromScanner(currentYear));
//        }

        // Challenge
        sumFiveIntegers();
    }

    public static void sumFiveIntegers() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i < 6; i++) {
            boolean validNumber = false;

            while(!validNumber) {
                System.out.println("Enter number #" + i + ":");

                try {
                    String input_string = scanner.nextLine();
                    int input_num = Integer.parseInt(input_string);
                    sum += input_num;
                    validNumber = true;
                } catch(NumberFormatException e) {
                    System.out.println("Invalid number");
                }
            }
        }

        System.out.println("The sum is: " + sum);
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks for taking the course!");

        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println(
                    "Enter a year of birth >= "
                    + (currentYear - 125)
                    + " and <= " + currentYear);

            String dob = scanner.nextLine();

            try{
                age = checkData(currentYear, dob);
                validDOB = age > -1;
            }catch(NumberFormatException badUserData) {
                System.out.println("Characters not allowed! Try again.");
            }
            
        } while(!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if(dob < minimumYear || dob > currentYear) {
            return -1;
        }

        return currentYear - dob;
    }
}
