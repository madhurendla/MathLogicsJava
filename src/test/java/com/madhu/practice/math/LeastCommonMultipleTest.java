package com.madhu.practice.math;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LeastCommonMultipleTest {


    @Test
    public void testFindLCM(){
        LeastCommonMultiple lcm = new LeastCommonMultiple();
        int lcmValue = lcm.findLCM(2,3,4,5,6);
        Assertions.assertEquals(60,lcmValue);


    }

    @Test
    void findLCM() {
    }

    @Test
    void allOutValuesAreSameFalse() {

        Map<Integer, Map<Integer,Integer>> masterMap = new HashMap<>();
        //Entry1
        Map<Integer,Integer> internalMap1 = new HashMap<>();
        internalMap1.put(3,6);
        masterMap.put(2,internalMap1);

        //Entry2
        Map<Integer,Integer> internalMap2 = new HashMap<>();
        internalMap2.put(2,7);
        masterMap.put(3,internalMap2);

        LeastCommonMultiple lcm = new LeastCommonMultiple();
        boolean valueBoolean = lcm.allOutValuesAreSame(masterMap);
        Assertions.assertFalse(valueBoolean);
    }

    @Test
    void allOutValuesAreSameTrue() {

        Map<Integer, Map<Integer,Integer>> masterMap = new HashMap<>();
        //Entry1
        Map<Integer,Integer> internalMap1 = new HashMap<>();
        internalMap1.put(3,6);
        masterMap.put(2,internalMap1);

        //Entry2
        Map<Integer,Integer> internalMap2 = new HashMap<>();
        internalMap2.put(2,6);
        masterMap.put(3,internalMap2);

        LeastCommonMultiple lcm = new LeastCommonMultiple();
        boolean valueBoolean = lcm.allOutValuesAreSame(masterMap);
        Assertions.assertTrue(valueBoolean);
    }
}