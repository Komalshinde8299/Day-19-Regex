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



    }
}
