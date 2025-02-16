public class LinearSearchWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
            "Celebrities wield significant influence over the public",
            " especially the youth",
            "its crucial for them to be good citizens",
            "for their followers"
        };
        String word = "love";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence containing '" + word + "': " + result);
    }
}
