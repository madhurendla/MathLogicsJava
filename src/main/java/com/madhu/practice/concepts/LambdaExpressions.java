package com.madhu.practice.concepts;

import java.util.function.IntFunction;

public class LambdaExpressions {

    public static void main(String[] args) {

        final IntFunction<Boolean> isOddNumber = (int number) -> number % 2 == 1 ? true : false;


    }
}
