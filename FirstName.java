package com.regex;
import java.util.regex.*;

public class FirstName {

	public static void main(String[] args) {
		System.out.println(firstName("Tom"));
	   }
	   // validate first name
	   public static boolean firstName( String firstName ) {
	      return firstName.matches( "[A-Z][a-z]*{3}" );
	   }
	}
