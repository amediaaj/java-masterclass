public class Main {
    public static void main(String[] args) {
        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 12, 3, 4, or 5");
                break;

        }

        // Enhanced switch statement
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 12, 3, 4, or 5");
        }

        String month = "OCTOBER";
        System.out.println("Month is in the " + getQuarter1(month) + " quarter");
        System.out.println("Month is in the " + getQuarter2(month) + " quarter");
        month = "XYZ";
        System.out.println("Month is in the " + getQuarter2(month) + " quarter");
    }

    public static String getQuarter1(String month) {
        switch(month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMEBER":
                return "4th";
        }

        return "bad";
    }

    // Enhanced switch expression
    public static String getQuarter2(String month) {
        // This switch statement is an expression, i.e. resolves too single value.
        // The value could be assigned to a variable instead of returned.
        return switch(month) {
            // When using code blocks yield is required to return a value
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            // default -> "bad";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
