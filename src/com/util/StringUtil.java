package com.util;

public final class StringUtil {
    private StringUtil() {
        throw new RuntimeException("Instance is impossible for the Utility class!");
    }

    public static void printLongestWord(String sentence) {
        final String[] words = sentence.split(" ");
        String longestWord = words[0];
        for (String word : words) {
            word = cleanWord(word);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in sentence: \"" +
                sentence + "\" - is: " + longestWord);
    }

    private static String cleanWord(String rawWord) {
        return rawWord
                .replace("!", " ")
                .replace("?", " ")
                .replace(".", " ")
                .replace(",", " ")
                .trim();
    }

    public static void printShortestWord(String sentence) {
        final String[] words = sentence.split(" ");
        String shortestWord = words[0];
        for (String word : words) {
            word = cleanWord(word);
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        System.out.println("The shortest word in sentence: \"" +
                sentence + "\" - is: " + shortestWord);
    }

    public static void printSameLetterWord(String sentence) {
        final String[] words = sentence.split(" ");
        for (String word : words) {
            final String clearedWord = cleanWord(word);
            if (startAndEndWithSameLetter(clearedWord)) {
                System.out.println(clearedWord);

            }
        }
    }

    private static boolean startAndEndWithSameLetter(String word) {
        if (word == null || word.length() <= 1) {
            return false;
        }
        char firstCharacter = word.charAt(0);
        char lastCharacter = word.charAt(word.length() - 1);
        return firstCharacter == lastCharacter;
    }

    public static void convert(String sentence) {
        final String[] words = sentence.split(" ");
        for (String word : words) {
            final String clearedWord = cleanWord(word);
            if (clearedWord.startsWith("L")) {
                System.out.println(clearedWord.toUpperCase());
            }
            if (clearedWord.contains("T")) {
                System.out.println(clearedWord.toLowerCase());
            }
        }
    }
}