package org.java;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial is " + fact);
		
	}

}
