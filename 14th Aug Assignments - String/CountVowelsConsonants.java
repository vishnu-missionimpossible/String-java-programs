public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        countVowelsConsonants(str);
    }

    public static void countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase to simplify counting
        str = str.toLowerCase();

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
