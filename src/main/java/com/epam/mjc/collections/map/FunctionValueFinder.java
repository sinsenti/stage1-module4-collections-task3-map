package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
  public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
    Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
    if (functionMap.containsValue(requiredValue)) {
      return true;
    }
    return false;
  }

  private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
    Map<Integer, Integer> result = new LinkedHashMap<>();
    for (int i : sourceList) {
      result.put(i, i * 5 + 2);
    }
    return result;
  }
}
