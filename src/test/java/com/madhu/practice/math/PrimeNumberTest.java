package com.madhu.practice.math;

import org.junit.jupiter.api.Test;


public class PrimeNumberTest {

    @Test
    public void testIdentifyPrimeNumbers(){

        int[] intArray = {6,9,4,98,45};
        System.out.println("intArray : "+intArray.length);
        PrimeNumber primeNumber =  new PrimeNumber();
        int[] ints = primeNumber.identifyPrimeNumbers(intArray);
        System.out.println("integers : "+ints.length);
        System.out.println(ints.toString());
    }

}