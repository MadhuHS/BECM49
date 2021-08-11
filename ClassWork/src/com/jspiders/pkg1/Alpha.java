//ACCESS - SPECIFIERS
package com.jspiders.pkg1;

public class Alpha 
{
   public    int    v1 = 100;
   protected double v2 = 8.51;
             long   v3 = 9199292929919292l;
   private   String v4 = "hello";
   
   public void test1()
   {
	   System.out.println("this is public-test1() of Alpha class");
   }
   
   protected void test2()
   {
	   System.out.println("this is protected-test2() of Alpha class");
   }
   
   void test3()
   {
	   System.out.println("this is pkg-leve-test3() of Alpha class");
   }
   
   private void test4()
   {
	   System.out.println("this is private-level-test4() of Alpha class");
   }
   
}
