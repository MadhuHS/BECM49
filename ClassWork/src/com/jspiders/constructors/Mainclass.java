package com.jspiders.constructors;

class Sample
{
   public Sample()//zero-arg-Constrcutor
   {
     System.out.println("this is Sample class Constructor");
   }

   public void test()
   {
   	 System.out.println("this is test() method");
   }
}

class Mainclass
{
   public Mainclass()//Default Constrcutor
   {
  
   }
	public static void main(String[] args)
	{
		System.out.println("Program starts..");

		Sample s1 = new Sample();//Constrcutor call

		System.out.println("Program ends...");
	}
}
