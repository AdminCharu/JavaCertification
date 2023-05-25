package Questions;

public class NumberType {
    boolean isDecreasing = true;
    boolean isIncreasing = true;

    public void numberType(String number) {

        for (int i = 1; i < number.length() - 1; i++) {
            //Set decreasing flag to false if number is increasing
            if (number.charAt(i) < number.charAt(i + 1)) {
                isDecreasing = false;

            }
            //Set increasing flag to false if number is increasing
            else if (number.charAt(i) > number.charAt(i + 1)) {
                isIncreasing = false;
            }
        }
        if (isIncreasing) System.out.println(number + " is an increasing number.");
        else if (isDecreasing) System.out.println(number + " is a decreasing number.");
        else System.out.println(number + " Neither increasing or decreasing order");
    }
}
