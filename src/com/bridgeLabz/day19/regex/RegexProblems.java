package com.bridgeLabz.day19.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblems {
    public static void main(String[] args) {

        //Code for adding 1st name
        Pattern p = Pattern.compile("^[A-Z][a-z]{3,}" );
        Matcher m = p.matcher("Komal");
        boolean result = m.matches();
        System.out.println(result);


        //Code for adding Lastname
        boolean result1 = Pattern.matches("^[A-Z][a-z]{3,}", "Shinde");
        System.out.println(result1);

        //Valid Email
        boolean result2 = Pattern.matches("[a-z]{3,}[.][a-z]{3,}?@[a-z]{2,}[.][a-z]{2,}[.][a-z]{2,}?", "abc.xyz@bl.co.in");
        System.out.println(result2);

        //Moblie No
        boolean result3 = Pattern.matches("^(91)[ ][1-9][0-9]{9}", "91 7057757826");
        System.out.println(result3);

        //Password
        //Rule1
        //
        //– minimum 8
        //
        //Rule1 - minimum 8 Characters
        boolean result4 = Pattern.matches("[a-z A-Z]{8,}", "komalshinde");
        System.out.println(result4);

        //Rule2 - Should have at least 1 Upper Case
        boolean result5 = Pattern.matches("(?=.*[A-Z])[a-z A-Z]{8,}", "KomalShinde");
        System.out.println(result5);


        //Rule3– Should have at least 1 numeric number in the password
        //boolean result6 = Pattern.matches("(?=.*[A-Z])(?=.*[0-9])[a-zA-Z]{8,}", "K8omalS9hinde");
        boolean result6 = Pattern.matches("(?=.*[A-Z])(?=.*[0-9]).{8,}", "K8omalS9hinde");
        System.out.println(result6);







    }
}
