package com.luckymart.jmp;                 //Java The Complete Reference - 7th Edition [DwzRG].pdf//
// create a superclass //                      // 157 inheritance //
  class A {
	  int i,j;
	  void showij(){
		  System.out.println("i and j: " + i + " " + j);
		  
	  }
  }
//Create a subclass by extending class A.//
  class B extends  A{
	  int k;
	  void showk(){
		  System.out.println("k :" + k);
		  }
	  void sum(){
		  System.out.println("i+j+k :" +( i+j+k));
		   }
	 }

public class SimpleInheritance {
public static void main(String[] args) {
	A superob = new A();
	B subob = new B();
	
	// The superclass may be used by itself.
	    superob.i =	10;
		superob.j = 20;
		System.out.println("Contents of superOb: ");	
		superob.showij();
		System.out.println();
		
		/* The subclass has access to all public members of
		its superclass. */
		subob.i = 11;
		subob.j = 22;
		subob.k = 33;
		System.out.println("Contents of subOb: ");
		subob.showij();
		subob.showk();
		subob.sum();
		
		
		
		
		
		
		
		
		
		
	
}
}
