package FirstSteps;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Hello Charu");
        System.out.println("Hello gal");

        int topScore=100,lowestScore=80;
        if((topScore<=101)&&(lowestScore>90)) {
            System.out.println("1.Logical AND Operator");
        }
        if((topScore<=101)&&(lowestScore>=80)) {
            System.out.println("2.Logical AND Operator");
        }
        if((topScore<=101)||(lowestScore>90)){
            System.out.println("3.Logical OR Operator");
        }
        if ((topScore == 101) ||(lowestScore > 90)) {
            System.out.println("4.Logical OR Operator");
        }

    }
}
