package Methods.CodingExercises;

public class PositiveNegativeZero {
    public static void main(String[] args) {
      /*  Positive, Negative or Zero
        Write a method called checkNumber with an int parameter number.
                The method should not return any value, and it needs to print out:

        "positive" if the parameter number is > 0

        "negative" if the parameter number is < 0

        "zero" if the parameter number is equal to 0

        NOTE: The checkNumber method needs to be defined as public static like we have been doing so far in the course.

        NOTE: Do not add a main method to your solution code!*/
    }
//In the udemy IDE I am writing only this function
    public static void checkNumber(int number) {
        System.out.println((number > 0 ? "positive" : (number < 0) ? "negative" : "zero"));
    }
}
