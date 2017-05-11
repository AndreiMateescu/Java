/**
 * Created by diamo on 23.04.2017.
 */
import java.util.*;

public class Main {

    /*private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){

        int[] myIntegers = getIntegers(5);
        for(int i=0;i<myIntegers.length;i++)
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);

        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number ) {
        System.out.println("Enter " + number + " integer value.\r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++)
            values[i] = scanner.nextInt();

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++)
            sum = sum + array[i];

        return (double) sum/(double) array.length;
    }
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values");
        for(int i=0;i<capacity;i++)
            array[i] = scanner.nextInt();

        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++)
            System.out.println("Element " + i + " contents "+ array[i]);

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length);
        for(int i=0;i<array.length;i++)
            sortedArray[i] = array[i];

        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
