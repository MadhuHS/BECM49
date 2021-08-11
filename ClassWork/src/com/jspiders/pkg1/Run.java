//ACCESS - SPECIFIERS
package com.jspiders.pkg1;

public class Run {

	public static void main(String[] args) {
		Alpha ref1 = new Alpha();

		System.out.println("this is v1 of Alpha class : " + ref1.v1);
		ref1.test1();
		
		System.out.println("this is v2 of Alpha class : " + ref1.v2);
		ref1.test2();
		
		System.out.println("this is v2 of Alpha class : " + ref1.v3);
		ref1.test3();

	}
}
