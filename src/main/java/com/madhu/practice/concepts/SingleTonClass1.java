package com.madhu.practice.concepts;

import java.util.Objects;

public class SingleTonClass1 {

    private String str;
    private static SingleTonClass1 singtonObj=null;

    public SingleTonClass1(){
        str = "This is the str parameter in SingleTonClass1! ";
    }

    public static SingleTonClass1 getSingleInstance(){
       // System.out.println(" 11111 # "+singtonObj.hashCode());
        if(singtonObj == null){
           // System.out.println(" 2222 # "+singtonObj.hashCode());
            return new SingleTonClass1();
        }
        System.out.println(" 333 # "+singtonObj.hashCode());


        return singtonObj;
    }
}
