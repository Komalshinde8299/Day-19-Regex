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



    }
}
