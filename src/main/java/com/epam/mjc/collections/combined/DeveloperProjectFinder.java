package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> strings=new LinkedList<>();
        for (Map.Entry<String,Set<String>> proEntry: projects.entrySet()){
            for (String s : proEntry.getValue()) {
                if(s==developer){
                    strings.add(proEntry.getKey());
                }
            }
        }
        strings.sort((o1, o2) -> {
            if (o1.length()!=o2.length()) {
                return o2.length()-o1.length(); //overflow impossible since lengths are non-negative
            }
            return o2.compareTo(o1);
        });
        return strings;
    }
}
