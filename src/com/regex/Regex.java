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


    //method to check user lastname
    public static boolean validLastName(String name){
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


    //method to check email id
    public static boolean validEmailId(String emailId){
        boolean flag=false;
        String regex = "^[a-z0-9+_.-]+@+[a-z]+.+[a-z]$";
        Pattern pattern =Pattern.compile(regex);
        for (int i=0;i <emailId.length();i++)
        {
            Matcher matcher=pattern.matcher(emailId);
            flag =matcher.matches();
        }
        return flag;
    }

    //method for mobile format
    public static boolean validMobileNo(String number){
        boolean flag=false;
        String regex ="^((\\+91)?|91)? ?[789][0-9]{9}";
        Pattern pattern =Pattern.compile(regex);
        for (int i=0;i <number.length();i++)
        {
            Matcher matcher=pattern.matcher(number);
            flag =matcher.matches();
        }
        return flag;
    }
}
