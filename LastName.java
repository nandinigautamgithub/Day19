package com.regex;

import java.util.Scanner;

public class LastName {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	      System.out.println(lastName("Hanks"));
	   }
	   
	   // validate last name
	   public static boolean lastName( String lastName ) {
	      return lastName.matches( "[A-Z][a-z]*" );
	   }

	}


