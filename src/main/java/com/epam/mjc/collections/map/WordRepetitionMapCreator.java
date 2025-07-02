package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.LinkedHashMap;

public class WordRepetitionMapCreator {
  public Map<String, Integer> createWordRepetitionMap(String sentence) {
    Map<String, Integer> result = new LinkedHashMap<>();
    if (sentence == null || sentence.trim().isEmpty()) {
      return result;
    }
    String[] words = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", " ").split("\\s+");
    for (String word : words) {
      word = word.trim();
      if (!word.isEmpty()) {
        result.put(word, result.getOrDefault(word, 0) + 1);
      }
    }
    return result;
  }
}
