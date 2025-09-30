package midterm1;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        // do problem 1 here:
        for (int i = 0; i < 61; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }

        // test problems 2 and 3 here:
        int[] array = new int[] {2,4,6,8};
        int[] answer = reverseArray(array);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] reverseArray(int[] array) {
        int[] answer = new int[array.length];

        int j = array.length-1;
        for (int i = 0; i < array.length; i++) {
            answer[j] = array[i];
            j--;
        }
        return answer;
    }

    public static int countZeroRows(int[][] grid) {
        int numZeros = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 0) {
                    numZeros++;
                    break;
                }
            }
        }
        return numZeros;
    }
}