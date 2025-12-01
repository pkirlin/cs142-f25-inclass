package bigoh;

import java.util.Arrays;

public class RecursiveMax {

    /* Recursive formulation:
       if there is only one element left in the array, return it (base case).
       otherwise: (recursive case):
           compute the max of the section of the array starting at the 2nd element.
           if this value is greater than the 1st element of the array, return the value, otherwise return the first element of the array.
    */

    public static int max(int[] array) {
        return max(array, 0);
    }

    // We will not actually change the array parameter when we call this function recursively.
    // Instead, we will consider the "valid" section of the array to be indices n, n+1, n+2, etc, up to array.length-1.
    // In other words, when we make the recursive call, n will change, but the array will not.
    public static int max(int[] array, int n) {
        // Base case: if only one element remains in the valid section of the list, return it.
        if (n == array.length - 1) {
            return array[n];
        } else {

            // Compute the max of the valid section of the array, except for the first element of the valid section.
            // Then, check if the max of that section is greater than the first element of the valid section,
            // and return whichever is larger.
            int maxOfRest = max(array, n + 1);
            if (maxOfRest > array[n]) {
                return maxOfRest;
            } else {
                return array[n];
            }
        }
    }


    // Test the function
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 1, 5};
        System.out.println("Maximum value: " + max(numbers)); // Output: 9

        int[] moreNumbers = {-5, -2, -10, -1};
        System.out.println("Maximum value: " + max(moreNumbers)); // Output: -1

        int[] bigArray = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        System.out.println("Maximum value: " + max(bigArray)); // Output: 0
    }
}