package Questions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Write a program to give me the second position of alphabet
        //2.Write a program to count occurrence
        System.out.println("-".repeat(50));
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        System.out.println("Enter a character");
        Scanner inputChar = new Scanner(System.in);
        char inChar = inputChar.next().charAt(0);

        //Creating object
        StringQues value = new StringQues();

        value.printSecondPosition(inputString, inChar);
        value.printOccurrence(inputString, inChar);

        System.out.println("The second position of " + inChar + "  is : "
                + value.printSecondPosition(inputString, inChar));
        System.out.println("Occurrence of  " + inChar + "  is : " + value.getCount() + " times");

        System.out.println("-".repeat(50));

//-------------------------------------------------------------------------------------------------------
        //3.WAP that Accepts three numbers from the user and prints "increasing"
        // if the numbers are in increasing order,
        //"decreasing" if the numbers are in decreasing order, and "Neither increasing or
        // decreasing order" otherwise

        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        String number = scn.next();

        //Creating object
        NumberType num=new NumberType();
        num.numberType(number);
        System.out.println("-".repeat(50));

//-----------------------------------------------------------------------------------------------------------
       //4.Write a program to check for Valid password
        System.out.println("Enter a password");
        Scanner password= new Scanner(System.in);
        String pass = password.next();

        new Password(pass);
        System.out.println("-".repeat(50));



    }
}
