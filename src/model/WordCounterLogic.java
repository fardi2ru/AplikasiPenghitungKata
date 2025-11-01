package model;

public class WordCounterLogic {
     public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public int countCharacters(String text) {
        if (text == null) return 0;
        return text.length();
    }

    public int countSentences(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    public int countParagraphs(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        String[] paragraphs = text.split("\\n+");
        return paragraphs.length;
    }
}
