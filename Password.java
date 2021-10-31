package com.regex;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your password: ");
	      String password = sc.next();
	      String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
	      //Matching the given Email id with regular expression
	      boolean result = password.matches(regex);
	      if(result) {
	         System.out.println("Given password is valid");
	      } else {
	         System.out.println("Given password is not valid");
	      }

	}

}
