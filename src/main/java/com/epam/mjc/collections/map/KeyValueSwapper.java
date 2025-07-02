package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
  public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
    Map<String, Integer> result = new LinkedHashMap<>();
    int n = sourceMap.size();
    for (int i = 0; i < n; i++) {
      String value = sourceMap.get(i);
      if (result.containsKey(value)) {
        continue;
      } else {
        if (value != null) {
          result.put(value, i);
        }
      }
    }
    return result;
  }
}
