package com.madhu.practice.concepts;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PhoneNumbersWithLetters {


    public static void main(String[] args) {
        PhoneNumbersWithLetters obj = new PhoneNumbersWithLetters();
        final String formatted = obj.formatPhoneNumber("CITYHELP13");
        System.out.println("formatted : "+formatted);
    }

    public String formatPhoneNumber(String phoneNumberwithLetters) {

        StringBuilder formattedPhNo = new StringBuilder("");
        int count = 1;
        for (Character char1 : phoneNumberwithLetters.toCharArray()) {
            final Character character = toNumber(char1);
            System.out.println("building the character at position " + char1);
            System.out.println("character given by for loop : " + character);

            switch (count) {
                case 1:
                    formattedPhNo.append("(");
                    break;
                case 4:
                    formattedPhNo.append(")");
                    break;
                case 7:
                    formattedPhNo.append("-");
                    break;
                default:
                    break;
            }

//                if (count == 1) {
//                formattedPhNo.append("(");
//            }
//            if (count == 4) {
//                formattedPhNo.append(")");
//            }
//            if (count == 7) {
//                formattedPhNo.append("-");
//            }
            formattedPhNo.append(character);
            System.out.println("formattedPhNo value in this iter : " + formattedPhNo);
            count = count + 1;
        }
        return formattedPhNo.toString();
    }

    private Character toNumber(Character character) {
        if(Character.isDigit(character)){
            return character;
        }
        Map<String, Character> letterVsNumbersMap = loadStandardMap();
        return letterVsNumbersMap.keySet().stream()
                .filter(isMatchingMapKey(character))
                .map(letterVsNumbersMap::get)
                .findFirst()
                .orElse('1');


    }

    private Predicate<String> isMatchingMapKey(Character character) {
        String requiredStr = String.valueOf(character);
        return stringValue -> stringValue.contains(requiredStr);
    }

    private Map<String, Character> loadStandardMap() {
        Map<String,Character> letterVsNumbersMap = new HashMap<>();



        letterVsNumbersMap.put("ABC",'2');
        letterVsNumbersMap.put("DEF",'3');
        letterVsNumbersMap.put("GHI",'4');
        letterVsNumbersMap.put("JKL",'5');
        letterVsNumbersMap.put("MNO",'6');
        letterVsNumbersMap.put("PQRS",'7');
        letterVsNumbersMap.put("TUV",'8');
        letterVsNumbersMap.put("WXYZ",'9');

        letterVsNumbersMap.put("ABC",'2');

        return letterVsNumbersMap;
    }
}
