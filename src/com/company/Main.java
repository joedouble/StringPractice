package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        String firstString = new String("Joseph Double");

        String secondString = new String("joseph double");

        boolean stringEquals = firstString.equals(secondString);
        boolean stringEqualsIgnoreCase = firstString.equalsIgnoreCase(secondString);

        int stringLength = firstString.length();

        String stringConcat = firstString.concat(secondString);

        char stringCharAt = firstString.charAt(3);

        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(stringEquals);
        System.out.println(stringEqualsIgnoreCase);
        System.out.println(stringLength);
        System.out.println(stringConcat);
        System.out.println(stringCharAt);

        String myName = new String("Joseph");
        String classmateName = new String("Omar");

        int stringCompareTo = myName.compareTo(classmateName);

        String stringReplace = myName.replace("s", "z");

        String stringSubstring = myName.substring(4);

        System.out.println(stringCompareTo);
        System.out.println(stringReplace);
        System.out.println(stringSubstring);

    }
}
