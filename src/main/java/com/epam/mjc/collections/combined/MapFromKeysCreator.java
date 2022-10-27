package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Set<String> setKeys = new HashSet<>();

            if (map.containsKey(entry.getKey().length())) {
                setKeys = map.get(entry.getKey().length());
            }

            setKeys.add(entry.getKey());
            map.put(entry.getKey().length(), setKeys);
        }
        return map;
    }
}
