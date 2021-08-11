package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample;


public class Mainclass {

	public static void main(String[] args) {

		System.out.println("Program starts...");
		
		Sample.display();
		
		Sample s1 = new Sample();
		
		s1.view();
		
		Sample.display();
		
		com.jspiders.pkg3.Sample.display();

		System.out.println("Program ends...");
	}
}
