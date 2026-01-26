import java.util.*;

public class nestedHash {
    public static void main(String[] args) {
        // Strings to process
        String[] strings = { "Ahmed", "Saheel", "AhmedSaheel" };

        // Outer HashMap to store inner HashMaps for each string
        HashMap<String, HashMap<Character, Integer>> nestedMap = new HashMap<>();

        // Process each string
        for (String str : strings) {
            // Inner HashMap to store character frequencies for the current string
            HashMap<Character, Integer> charCountMap = new HashMap<>();

            // Count characters
            for (char c : str.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Add the inner map to the outer map with the string as the key
            nestedMap.put(str, charCountMap);
        }

        // Print the nested HashMap
        for (Map.Entry<String, HashMap<Character, Integer>> entry : nestedMap.entrySet()) {
            System.out.println("String: " + entry.getKey());
            System.out.println("Character Frequencies: " + entry.getValue());
            System.out.println();
        }
    }
}
