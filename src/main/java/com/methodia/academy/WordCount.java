package com.methodia.academy;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        String str = "The cats hate dogs and dogs hate cats.";
        Map<String, Integer> wordCountMap = countWords(str);
        System.out.println(wordCountMap);
    }

    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = str.split("\\s+|\\p{Punct}");

        for (String word : words) {

            if (!word.isEmpty()) {
                Integer count = wordCountMap.getOrDefault(word, 0);
                wordCountMap.put(word, count + 1);
            }
        }
        return wordCountMap;
    }
}
