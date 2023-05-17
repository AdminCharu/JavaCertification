package FirstSteps;

public class TernaryOperator {
    public static void main(String[] args) {
        String myCar = "Audi";
        boolean isCar = myCar == "Audi" ? false : true;
        //isCar is set to false

        //1
        if (isCar) {
            System.out.println("1.This car is Audi");
            /*If the condition returns true,we assign the value after the question mark,
            to the variable on the left side of the equals sign.However, if the condition returns false, we assign the value after the colon, to the variable.
            So nothing will be printed*/
        }

        //2
        isCar = myCar == "Audi" ? true : false;
        if (isCar) {
            System.out.println("2.This car is Audi");
        }

        //3
        String myName = "Charu";
        String surname = myName == "Charu" ? "Charu Srivastava" : "Value is false";
        System.out.println(surname);


        //4
        String name= "Charu";
        String fullName =name == "Charu Srivastava" ? "Charu Srivastava" : "Value is false";
        System.out.println(fullName);

        //5
        int age= 21;
        String myage=age>=20 ? "My age is 21" : "My age is not given";
        System.out.println(myage);
    }
}
