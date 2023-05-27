package com.madhu.practice.concepts;

public class MainSingleTon {

    public static void main(String[] args) {
        SingleTonClass1 singleInstanceA = SingleTonClass1.getSingleInstance();
        SingleTonClass1 singleInstanceB = SingleTonClass1.getSingleInstance();
        SingleTonClass1 singleInstanceC = SingleTonClass1.getSingleInstance();
        SingleTonClass1 singleInstanceD = SingleTonClass1.getSingleInstance();

        //singleInstanceA.str = (singleInstanceA.str).toUpperCase();

        System.out.println(singleInstanceA.hashCode());
        System.out.println(singleInstanceB.hashCode());
        System.out.println(singleInstanceC.hashCode());
        System.out.println(singleInstanceD.hashCode());
    }
}
