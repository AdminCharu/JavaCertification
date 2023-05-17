package CodingExercises.Exercise2;

    public class SpeedConverter {
        // write your code here
        public static long toMilesPerHour(double kilometersPerHour){
            if(kilometersPerHour<0){
                return -1;
            }
            else{
                double milesPerHors=kilometersPerHour/1.609;
                long roundedValue=Math.round(milesPerHors);
                return roundedValue;
            }
        }
        public static void printConversion(double kilometersPerHour){
            if(kilometersPerHour<0){
                System.out.println("Invalid Value");
            }
            else
            {
                double milesPerHors=kilometersPerHour/1.609;
                long roundedValue=Math.round(milesPerHors);
                System.out.println(kilometersPerHour + " km/h = " + roundedValue + " mi/h ");
            }
        }
    }


