package Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //1st way of initializing an array
        int[] myArray = new int[10];
        myArray[4] = 10;

        double[] myNewArray = new double[10];
        myNewArray[6] = 20.9;

        //2nd way
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(array[1]);
        System.out.println(array.length);
//        System.out.println(array[array.length]);   //This will give error instead of giving last index value
        System.out.println(array[array.length - 1]); //This will give result since array has length of 10
                                                     //    but size or indexing is 0-9


//        int[] arrayTwo;
//        arrayTwo={1, 2, 3, 4, 5, 6, 7, 8, 9, 0};      -> This will give error

        int[] arrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};  //Correct

        int[] arrayThree;
        arrayThree=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};  //Correct

        //Unintialized array
        int arr[];
        arr=new int[5];
//        System.out.println(arr[0]);  //-> default value will be printed here.

        for(int i=0;i<arr.length;i++){
            arr[i]=arr.length-i;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.println("  ".repeat(5) + arr[i]);

            //System.out.println(arr); //-> This will give wrong results

        }
            //To print a complete array java.util library has method Array.toString

            System.out.println("From Arrays.toString function : " + Arrays.toString(arr));
        }




        }


