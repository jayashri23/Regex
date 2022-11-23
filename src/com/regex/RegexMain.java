package com.regex;


import java.util.ArrayList;
import java.util.Scanner;

import static com.regex.Regex.*;
import static com.regex.Regex.validEmailId;

public class RegexMain {
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the user's First Name:");
        String firstName= sc.next();
        if (validFirstName(firstName)){
            System.out.println("Given first name: " +firstName+" is valid");
        }else
        {
            System.out.println("Given first name: " +firstName+" is not valid");
        }


        System.out.println("Enter the user's last Name:");
        String lastName = sc.next();
        if (validLastName(lastName)){
            System.out.println("Given last name: " +lastName+" is valid");
        }else
        {
            System.out.println("Given last name: " +lastName+ " is not valid");
        }

        System.out.println("Enter the user's email id :");
        String emailId = sc.next();
        if(validEmailId(emailId)) {
            System.out.println("Given email id: " + emailId + " is valid: " + validEmailId(emailId));
        }
        else {
            System.out.println("Given email id: " + emailId + " is  not valid: " +validEmailId(emailId));

        }

        System.out.println("Enter the user's Mobile Number :");
        String mobileNumber = sc.next();
        if (validMobileNo(mobileNumber)){
            System.out.println("Given Mobile Number: " +mobileNumber+" is valid");
        }else
        {
            System.out.println("Given Mobile Number: " +mobileNumber+ " is not valid");
        }

        System.out.println("Enter the user Password:");
        String password =sc.next();
        if (validPassword(password)){
            System.out.println("Given Password :"+password+ "is valid");
        }else {
            System.out.println("Given Password :"+password+ "is not valid");
        }
        validEmail();
    }
}

