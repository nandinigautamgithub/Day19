package com.regex;

import java.util.Scanner;

public class ContactNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Contact number: ");
	      String contact = sc.next();
	      String regex = "(0/91)?[7-9][0-9]{9}";
	      //Matching the given Email id with regular expression
	      boolean result = contact.matches(regex);
	      if(result) {
	         System.out.println("Given Contact Number is valid");
	      } else {
	         System.out.println("Given Contact Number is not valid");
	      }

	}

}
