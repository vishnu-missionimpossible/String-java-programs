public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to reverse";
        String reversed = reverseSentence(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversed);
    }

    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Reverse the order of the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add space between words except for the last word
            }
        }
        
        return reversed.toString();
    }
}