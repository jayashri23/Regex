package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    //method to check
    //
    // username
    public static boolean validFirstName(String name){
        boolean flag=false;
        String regex = "[A-Z][a-z]{3,}";     //3, means above 3 char first name
        Pattern pattern =Pattern.compile(regex);
        for (int i=0;i <name.length();i++)
        {
            Matcher matcher=pattern.matcher(name);
            flag =matcher.matches();
        }
        return flag;
    }
}
