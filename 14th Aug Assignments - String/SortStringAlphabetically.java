import java.util.Arrays;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String str = "hello world";
        String sortedStr = sortStringAlphabetically(str);
        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);
    }

    public static String sortStringAlphabetically(String str) {
        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();

        // Sort the array
        Arrays.sort(charArray);

        // Convert the sorted array back to a string
        return new String(charArray);
    }
}
