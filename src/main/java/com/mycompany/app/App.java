package com.mycompany.app;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Possible letter combinations for dial pad
 */
public class App {
    // The mappings of number -> letters
    private static HashMap<Integer, char[]> mappings = new HashMap<Integer, char[]>() {
        {
            put(0, new char[]{});
            put(1, new char[]{});
            put(2, new char[]{'a', 'b', 'c'});
            put(3, new char[]{'d', 'e', 'f'});
            put(4, new char[]{'g', 'h', 'i'});
            put(5, new char[]{'j', 'k', 'l'});
            put(6, new char[]{'m', 'n', 'o'});
            put(7, new char[]{'p', 'q', 'r', 's'});
            put(8, new char[]{'t', 'u', 'v'});
            put(9, new char[]{'w', 'x', 'y', 'z'});
        }
    };

    /**
     * The app's entrance. Please input numbers that separated with a space in console.
     * @param args
     */
    public static void main(String[] args) {
        Integer[] numbers = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(App.possibleLetterCombinations(numbers));
    }

    /**
     * @param numbers
     * @return
     */
    public static ArrayList<String> possibleLetterCombinations(Integer[] numbers) {
        ArrayList<char[]> lettersList = new ArrayList<>();
        // Get corresponding letters for numbers
        for (Integer number : numbers) {
            char[] letters = App.mappings.get(number);
            if (letters != null && letters.length > 0) {
                lettersList.add(letters);
            }
        }

        return App.combine(lettersList);
    }

    /**
     * Get all possible combinations for letters list
     * @param lettersList
     * @return
     */
    private static ArrayList<String> combine(ArrayList<char[]> lettersList) {
        ArrayList<String> combinaions = new ArrayList<String>() {{
            add("");
        }};
        for (char[] letters : lettersList) {
            combinaions = App.splice(combinaions, letters);
        }
        return combinaions;
    }

    /**
     * @param combinations
     * @param letters
     * @return
     */
    private static ArrayList<String> splice(ArrayList<String> combinations, char[] letters) {
        ArrayList<String> newCombinations = new ArrayList<>();
        for (String combination : combinations) {
            for (char letter : letters) {
                newCombinations.add(combination + letter);
            }
        }
        return newCombinations;
    }
}
