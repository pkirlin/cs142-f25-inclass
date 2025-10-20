package recursion;

public class Recursion1 {

    public static void main(String[] args) {
        // Test iterative factorial:
        for (int i = 1; i <= 10; i++) {
            long factAnswer = fact(i);
            System.out.println("The factorial of " + i + " (calculated iteratively) is " + factAnswer);
        }

        // Test recursive factorial:
        for (int i = 1; i <= 10; i++) {
            long factAnswer = factRec(i);
            System.out.println("The factorial of " + i + " (calculated recursively) is " + factAnswer);
        }

        // Test iterative string reverse:
        System.out.println("Iterative string reverse: " + reverse("abcde"));

        // Test recursive string reverse:
        System.out.println("Recursive string reverse: " + reverseRec("abcde"));

    }

    public static long fact(int num) {
        long answer = 1;
        for (int i = num; i > 1; i--) {
            answer = answer * i;
        }
        return answer;
    }

    public static long factRec(int num) {
        if (num == 1) { // base case
            return 1;
        } else { // recursive case
            long value = factRec(num - 1);
            return value * num;
        }
    }

    public static String reverse(String str) {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    public static String reverseRec(String str) {
        return ""; // remove this when you start coding
    }
}