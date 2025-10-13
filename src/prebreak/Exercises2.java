package prebreak;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises2 {

    public static void main(String[] args) {
        // Test readWords:

        ArrayList<String> words = readWords();

        // Test words with every vowel:

        ArrayList<String> wordsWithAllVowels = wordsContainingEveryVowel(words);
        System.out.println(wordsWithAllVowels);

        // Test words with every vowel exactly once:
        ArrayList<String> wordsWithAllVowelsOnce = wordsContainingEveryVowelExactlyOnce(words);
        System.out.println(wordsWithAllVowelsOnce);

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
        InputStream is = Exercises2.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.err.println("Could not open file: words.txt");
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        ArrayList<String> answer = new ArrayList<>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            //System.out.println(line); // for debugging only
            answer.add(line);
            //System.out.println(answer);
        }
        System.out.println(answer.size());
        return answer;
    }

    public static int linearSearch(ArrayList<String> list, String lookingFor) {
        return 0;
    }

    public static ArrayList<String> wordsContainingEveryVowel(ArrayList<String> list) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.contains("a") && word.contains("e") && word.contains("i")
                    && word.contains("o") && word.contains("u")) {
                answer.add(word);
            }
        }

        return answer;
    }

    public static ArrayList<String> wordsContainingEveryVowelExactlyOnce(ArrayList<String> list) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == 'a') {
                    countA++;
                } else if (word.charAt(j) == 'e') {
                    countE++;
                } else if (word.charAt(j) == 'i') {
                    countI++;
                } else if (word.charAt(j) == 'o') {
                    countO++;
                } else if (word.charAt(j) == 'u') {
                    countU++;
                }
            }
            if (countA == 1 && countE == 1 && countI == 1 && countO == 1 && countU == 1) {
                answer.add(word);
            }
        }

        return answer;

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