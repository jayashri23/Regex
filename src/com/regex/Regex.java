package com.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
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

    //method for password
    public static boolean validPassword(String passwd){
        boolean flag = false;
        String regex ="^(?=.*[A-Z))(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
      //  (?=.*[0-9])->represent  a digit must at once
        // (?=.*[a-z])-> represent a lower char at least once
        //(?=.*[A-Z])-> represent a capital char at least once
        Pattern pattern =Pattern.compile(regex);
        for (int i=0 ;i<passwd.length();i++){
            Matcher matcher =pattern.matcher(passwd);
            flag =matcher.matches();
        }
        return flag;
    }

    //method to check email ids
    public static void validEmail(){

        ArrayList<String> list=new ArrayList<>();
        list.add("ambc@yahoo.com");
        list.add("abc-100@yahoo.com");
        list.add("abc111@abc.com");
        list.add("abc.100@yahoo.com");
        list.add("abc-100@abc.net");
        list.add("abc.100@abc.com.au");
        list.add("abc@1.com");
        list.add("abc@gmail.com.com");
        list.add("abc+100@gmail.com");
        String regex ="^[a-z0-9+_.-]+@[a-z]+.+[a-z]+.+[a-z]$";
        Pattern pattern =Pattern.compile(regex);
        for (int i=0; i< list.size();i++){
            Matcher matcher =pattern.matcher(list.get(i));
            boolean result =matcher.matches();
            System.out.println("Given sample email id :"+list.get(i)+"is valid:" +result);
        }
        for (int i=list.size()-1;i>1;i--){
            list.remove(i);
        }
    }
}
