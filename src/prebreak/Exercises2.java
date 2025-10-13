package prebreak;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises2 {

    public static void main(String[] args) {
        // Test readWords:

        readWords();

        // Test words with every vowel:

        // Test words with every vowel exactly once:

        // Test letters in alphabetic order:

        // Test finding palindromes:

        // Test autocorrect:
    }

    public static ArrayList<Integer> noDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (!answer.contains(list.get(i))) {
                answer.add(list.get(i));
            }
        }
        return answer;
    }

    public static void noDuplicatesChallenge(ArrayList<Integer> list) {

    }

    public static String reverseString(String str) {
        String answer = "";
        for (int i = str.length()-1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        return answer;
    }

    public static ArrayList<String> readWords() {
        InputStream is = Exercises.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.err.println("Could not open file: words.txt");
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        ArrayList<String> answer = new ArrayList<>();

        // write loop here

        return answer;
    }

    public static int linearSearch(ArrayList<String> list, String lookingFor) {
        return 0;
    }

    public static ArrayList<String> wordsContainingEveryVowel(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> wordsContainingEveryVowelExactlyOnce(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> lettersInAlphaOrder(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> findPalindromes(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> simpleAutocorrect(ArrayList<String> list, String word) {
        return null;
    }
}