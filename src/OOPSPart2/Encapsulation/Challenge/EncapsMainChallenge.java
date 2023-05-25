package OOPSPart2.Encapsulation.Challenge;

import java.util.Scanner;

public class EncapsMainChallenge {
    public static void main(String[] args) {
        System.out.println("Enter whether printer is duplex? True/False");
        Scanner sc = new Scanner(System.in);
        boolean duplex = sc.nextBoolean();

        System.out.println("Enter the number of pages to be printed");
        Scanner scan = new Scanner(System.in);
        int pages = scan.nextInt();

        Printer printer = new Printer(pages, duplex);
        printer.addToner(10);
        System.out.println("Initial count : " + printer.getPagesPrinted());
        /* printer.printPages(20); */
        System.out.printf("Current job pages are %d,Total pages required by printer is %d %n", printer.printPages(pages),
                printer.getPagesPrinted());
    }
}
