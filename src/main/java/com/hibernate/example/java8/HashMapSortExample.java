package com.hibernate.example.java8;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSortExample {
    public static void main(String ar[]){
        Map<String, Integer> scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        Set<Map.Entry<String,Integer>> set=scores.entrySet();
        List<Map.Entry<String ,Integer>> list=new ArrayList<>(set);
        list.sort((x,y)->x.getValue().compareTo(y.getValue()));
        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> en:list){
            sortedMap.put(en.getKey(),en.getValue());
        }
        System.out.println(sortedMap);
    }
}
