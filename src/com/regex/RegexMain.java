package com.regex;


import java.util.Scanner;

import static com.regex.Regex.validFirstName;

public class RegexMain {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the user's First Name:");
        String firstName= sc.next();
        if (validFirstName(firstName)){
            System.out.println("Given first name: " +firstName+" is valid");
        }else
        {
            System.out.println("Given first name: " +firstName+ " is not  valid");
        }
    }
}
