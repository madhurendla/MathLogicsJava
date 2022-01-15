package com.madhu.practice.math;

import java.util.*;
import java.util.stream.Collectors;

public class LeastCommonMultiple {

    public int findLCM(Integer... integers){
        //Initial Map Data setup
        Map<Integer, Map<Integer, Integer>> masterMap = initializeMasterMap(integers);
        System.out.println(masterMap);

        //counting the iterations
        int iteration = 0;
        //loop will execute until all the values are same.
        while(!allOutValuesAreSame(masterMap)){
            iteration++;
            System.out.println("iteration  : "+iteration);
            System.out.println("current masterMap : "+masterMap);

            //Looping through the map for this iteration
            for (Map.Entry<Integer, Map<Integer, Integer>> entry : masterMap.entrySet()) {
                Integer inputKey = entry.getKey();
                Map<Integer, Integer> currentInternalMap = entry.getValue();
                int leastOutputValueOfAll = findLeastOutputValueOfAll(masterMap);
                System.out.println("leastOutputValueOfAll : " + leastOutputValueOfAll);
                Integer currentKey = currentInternalMap.entrySet().stream().findFirst().get().getKey();
                Integer currentValue = currentInternalMap.entrySet().stream().findFirst().get().getValue();

                //verifying the entry value if this needs to be incremented.
                if (currentValue <= leastOutputValueOfAll) {
                    Integer newValue = inputKey * (currentKey + 1);
                    Map<Integer, Integer> newInternalMap = new HashMap<>();
                    newInternalMap.put(currentKey + 1, newValue);
                    masterMap.put(inputKey, newInternalMap);
                }
                System.out.println("master map inside for each loop : " + masterMap);
                //verifying the updated value is matching with all the values -> to be LCM
                if (allOutValuesAreSame(masterMap)) {
                    break;
                }
            }
        }

        return findLeastOutputValueOfAll(masterMap);
    }

    private Map<Integer, Map<Integer, Integer>> initializeMasterMap(Integer[] integers) {
        //Initializing map
        Map<Integer, Map<Integer,Integer>> masterMap = new HashMap<>();
        Arrays.stream(integers)
                .sorted()
                .forEach(inputIntValue ->{
                    Map<Integer,Integer> internalMap = new HashMap<>();
                    internalMap.put(1,inputIntValue);
                    masterMap.put(inputIntValue,internalMap);
                });
        return masterMap;
    }

    private int findLeastOutputValueOfAll(Map<Integer, Map<Integer, Integer>> masterMap) {
        return masterMap
                .values()
                .stream()
                .map(Map::values)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet())
                .stream()
                .sorted().findFirst()
                .orElse(1);
    }

    public boolean allOutValuesAreSame(Map<Integer, Map<Integer, Integer>> masterMap) {
        return masterMap
                .values()
                .stream()
                .map(Map::values)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet())
                .size() == 1;
    }
}
