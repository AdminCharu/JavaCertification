package ExpressionsStatements;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int out=a;
            for (int k = 0; k < n; k++) {
                    int finalOut = (int)(out + (Math.pow(2, k))*b);
                    out=finalOut;
                    System.out.print(" " + out + " ");
                }
                System.out.println("\n");
            }
        }
    }
