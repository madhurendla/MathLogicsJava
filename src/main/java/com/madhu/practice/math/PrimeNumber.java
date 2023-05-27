package com.madhu.practice.math;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * This program should accept an array of numbers. It should iterate through the array
 * of numbers and determine if each is prime or not.
 * Once it’s done processing, it should return only those numbers that are prime in an array.
 */
public class PrimeNumber {

    public int[] identifyPrimeNumbers(int[] intArray){
        return Arrays.stream(intArray)
                .filter(integer -> !isNotPrimeNumber(integer))
                .peek(System.out::println)
                .toArray();
    }

    private boolean isNotPrimeNumber(Integer integer) {
        boolean isNotPrime = false;
        if(integer == 2){
            isNotPrime = false;
        }else{
            int halfWayNumber =  integer / 2;
            for(int i = 2; i <= halfWayNumber;i++){
                if(integer % i == 0){
                    isNotPrime = true;
                    break;
                }
            }
        }

        return isNotPrime;
    }
}
