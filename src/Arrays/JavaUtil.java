package Arrays;

import java.util.Arrays;
import java.util.Random;

public class JavaUtil {
    public static void main(String[] args) {
        int[] firstArray=getRandomNumbers(10);
        System.out.println(Arrays.toString(firstArray));
        //To sort array
        Arrays.sort(firstArray);
        System.out.println("Sorted array is : " + Arrays.toString(firstArray));

        //To fill array indexes with same value
        int[] secondArray=new int[10];
        System.out.println("Array with no initialized value : " + Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println("Array with all indexes set to value 5 using fill method : " + Arrays.toString(secondArray));


        //To copy

        int[] thirdArray=getRandomNumbers(10);
        System.out.println("Array to copy : " + Arrays.toString(thirdArray));

        int[] fourthArray=Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println("Copied Array : " + Arrays.toString(fourthArray));

        //To perform sort on copied Array
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));  //->Only this will be sorted
        System.out.println(Arrays.toString(thirdArray));  //->Original one will not get affected


        //CopyOf
        int[] smallArray=getRandomNumbers(5);
        System.out.println("Array to copy : " + Arrays.toString(smallArray));

        int[] largeArray=Arrays.copyOf(smallArray,15);
        System.out.println("Copied Array : " + Arrays.toString(largeArray));  //-> Add extra 0's after copying 5 elements


    }
    public static int[] getRandomNumbers(int len){
        Random random=new Random();
        int[] arr=new int[len];
        for(int i =0;i<len;i++){
            arr[i]= random.nextInt(100);
//            arr[i]= random.nextInt();  //without bound it will generate number of any bound as 1968615061 etc
        }
        return arr;
    }
}
