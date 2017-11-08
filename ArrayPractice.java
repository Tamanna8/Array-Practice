package arraypractice;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Tamanna Sharma
 */
public class ArrayPractice {

    static Random rand;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rand = new Random();
        int[] myArray = salsArray();
        changeArray(myArray);
        for (int i : myArray) {
            System.out.println(i);
        }
        int index = linearSearch(myArray, 85);
        System.out.println("index of 85=" + index);
        Arrays.sort(myArray);
        for (int i : myArray) {
            System.out.println(i);
        }
        index = binarySearch(myArray, 85);
        System.out.println("index of 85=" + index);
    }

    private static int[] salsArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    private static void changeArray(int[] arr) {
        int max = arr[0];
        if (arr[arr.length - 1] > max) {
            max = arr[arr.length - 1];

        }
        arr[0] = max;
        arr[arr.length - 1] = max;
    }

    public static int linearSearch(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length && index < 0; i++) {
            index = i;
        }
        return index;
    }

    public static int binarySearch(int[] arr, int target) {

        int index = -1;
        int first = 0;
        int last = arr.length - 1;
        int middle = 0;
        while (first <= last && index < 0) {

            middle = (first + last) / 2;
            if (arr[middle] == target) {
                index = middle;
            } else if (arr[middle] > target) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return index;
    }
}
