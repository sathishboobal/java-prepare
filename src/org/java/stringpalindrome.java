package org.java;

import java.util.Iterator;
import java.util.Scanner;

public class stringpalindrome {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		String word1 = s.nextLine();
		s.close();
		String word2="";
		for (int i = word1.length()-1; i >=0; i--) {
			word2=word2+word1.charAt(i);
			
		}
		System.out.println(word2);
		if (word1.equals(word2)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
