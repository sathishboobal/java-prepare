package org.java;

import java.util.Scanner;

public class scannerclass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Student id");
		int id = s.nextInt();
		s.nextLine();
		System.out.println("Student id is : " +  id) ;
		
		System.out.println("Student name");
		String name = s.nextLine();
		System.out.println("Student name is : " + name);
		
		System.out.println("mark");
		int mark = s.nextInt();
		s.nextLine();
		System.out.println("mark : " + mark);


	}

}
