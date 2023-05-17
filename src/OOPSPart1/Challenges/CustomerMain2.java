package OOPSPart1.Challenges;

import OOPSPart1.Challenges.Customer2;

public class CustomerMain2 {
    public static void main(String[] args) {
        Customer2 customer=new Customer2("Tim",1234556,"abcv@cvf.com");
        Customer2 customer2=new Customer2("Tim","abcv@cvf.com");
        Customer2 customer3=new Customer2();
        System.out.println(customer);//toString method is defined in customer class which prints this ref results
    }
}
