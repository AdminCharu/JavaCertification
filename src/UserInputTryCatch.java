import java.util.Scanner;

public class UserInputTryCatch {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(takeInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(takeInputFromScanner(currentYear));
        }
    }

    public static String takeInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi there, what's your name?");
        System.out.println("Hi" + name);
        String birthYear = System.console().readLine("What's your year of birth?");
        int age = currentYear - Integer.parseInt(birthYear);
        return "So you are" + age + "years old";
    }

    public static String takeInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi  " + name);
//        String birthYear = scanner.nextLine();
//        int age = currentYear - Integer.parseInt(birthYear);
        System.out.println("What's your year of birth?");
        boolean validYear = false;
        int inputAge = 0;
        do {
            System.out.println("Enter year of birth between > " + (currentYear - 125) + " and <=" + currentYear);
            try {
                inputAge = checkDate(currentYear, scanner.nextLine());
                validYear = inputAge < 0 ? false : true;
            } catch (NumberFormatException e) {
                System.out.println("Characters are not allowed!!!!!");
            }
        } while (!validYear);
        return "So you are  " + inputAge + "  years old";

    }

    public static int checkDate(int currentYear, String dateOfBirth) {
        int year = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;
        if ((year < minYear) || (year > currentYear)) {
            return -1;
        }
        return (currentYear - year);
    }
}


