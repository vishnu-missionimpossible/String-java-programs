public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(sentence)) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is not a Pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        // Create an array to mark the presence of each letter
        boolean[] mark = new boolean[26];
        int index;

        // Traverse through the sentence and mark the presence of each letter
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // If uppercase character, convert to lowercase
            if ('A' <= ch && ch <= 'Z')
                index = ch - 'A';
            // If lowercase character, set index accordingly
            else if ('a' <= ch && ch <= 'z')
                index = ch - 'a';
            else
                continue; // Skip characters that are not letters

            mark[index] = true; // Mark the presence of the letter
        }

        // Check if all letters are marked
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                return false;

        return true;
    }
}
