package com.madhu.practice.concepts;

public class ReverseString {

    public static void main(String[] args) {
        String inputStr = "ABCDEFG";


        ReverseString reverseString = new ReverseString();
        String outputValue = reverseString.reverseGivenString(inputStr);
        System.out.println(outputValue);
    }

    public String reverseGivenString(String input){
        String outputStr = "";
        for (Character inputChar: input.toCharArray()) {
            System.out.println("character given by forLoop : "+inputChar);
            outputStr = inputChar+outputStr;
          //  outputStr = outputStr+inputChar;
            System.out.println("I appeneded given charater : "+outputStr);
        }
        return outputStr;
    }
}
