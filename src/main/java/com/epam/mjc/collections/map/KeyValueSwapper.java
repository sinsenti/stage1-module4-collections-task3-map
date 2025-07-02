package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
  public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
    Map<String, Integer> result = new HashMap<>();

    for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();

      if (!result.containsKey(value) || key < result.get(value)) {
        result.put(value, key);
      }
    }

    return result;
  }
}
