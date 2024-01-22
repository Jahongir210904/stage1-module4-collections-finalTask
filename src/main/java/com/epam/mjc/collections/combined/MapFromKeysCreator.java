package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>>map=new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()){
            boolean state=false;
            for (Map.Entry<Integer,Set<String>>setEntry: map.entrySet()){
                if(setEntry.getKey()==entry.getKey().length()){
                    state=true;
                    setEntry.getValue().add(entry.getKey());
                }
            }
            if(!state){
                Set<String>strings=new HashSet<>();
                strings.add(entry.getKey());
                map.put(entry.getKey().length(),strings);
            }
        }
        return map;
    }
}
