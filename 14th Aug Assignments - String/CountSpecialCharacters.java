public class CountSpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello! How are you?";
        int specialCharCount = countSpecialCharacters(str);
        System.out.println("Number of special characters: " + specialCharCount);
    }

    public static int countSpecialCharacters(String str) {
        int specialCharCount = 0;

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a special character (not a letter or digit)
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        return specialCharCount;
    }
}
