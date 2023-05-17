package FirstSteps;

public class AssignmentOperators {
    public static void main(String[] args) {
        int val = 50;
//        if(val=50){              //error because if required type is boolean
//            System.out.println("State is false");
//        }
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("1.Statement is true");
        }
        if (isCar) {
            System.out.println("2.Statement is true");
        }
        isCar = false;
        if (isCar) {
            System.out.println("3.Statement is true");
        }
        if (!isCar) {
            System.out.println("4.Statement is true");
        }
        if (isCar != false) {
            System.out.println("5.Statement is true");
        }
        if (!(isCar = false)) {
            System.out.println("6.Statement is true");
        }
    }
}
