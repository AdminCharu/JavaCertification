package OOPSPart1.Challenges;

import OOPSPart1.Challenges.BankAccount1;

public class ClassChallenge1 {
    public static void main(String[] args) {
     BankAccount1 myAcct=new BankAccount1();

     myAcct.setAccountBalance(10000);
     myAcct.deposit(1000);
     myAcct.withdraw(200);
    }
}
