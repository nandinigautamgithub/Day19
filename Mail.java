package com.regex;

import java.util.Scanner;

public class Mail {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String email = sc.next();
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+${3}";
	      //Matching the given Email id with regular expression
	      boolean result = email.matches(regex);
	      if(result) {
	         System.out.println("Given email-id is valid");
	      } else {
	         System.out.println("Given email-id is not valid");
	      }
	}

}
