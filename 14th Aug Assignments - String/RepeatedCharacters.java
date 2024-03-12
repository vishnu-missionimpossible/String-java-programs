import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        printRepeatedCharacters(str);
    }

    public static void printRepeatedCharacters(String str) {
        // Create a map to store character frequencies
        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Count frequencies of characters
        for (char c : str.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        // Print characters with frequency more than 1
        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
