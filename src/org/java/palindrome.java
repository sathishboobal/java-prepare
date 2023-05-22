package org.java;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		System.out.println("Enter numbers");
		Scanner s=new Scanner(System.in);
		int number = s.nextInt();
		s.close();
		int original=number;
		int rem=0;
		int check=0;
		while (number>0) {
			rem=number%10;
			check=(check*10)+rem;
			number=number/10;
			
		}
		System.out.println(check);
		if (original==check) {
			System.out.println("It is palindrome");
		}
			else {
				System.out.println("Not palindrome");
				
			}
		
		
		
		
	}

}
