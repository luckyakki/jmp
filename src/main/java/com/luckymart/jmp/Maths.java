package com.luckymart.jmp;

public class Maths {
	
   private static int a;
   private static int b;
   private int c;
   
   private static float A;
   private static float B;
   private static float C;
   
  
   
   public int add(int a, int b){
	   c = a + b;
	   return  c;
   }
   
   public float add(float A, float B){
	   C = A+ B;
	   System.out.println(C);
	   return  C;
   }
   
   public static void main(String args[]){
	   Maths mathsObj  = new Maths();
	  System.out.println("Sum of 10 + 6 = "+ mathsObj.add(10, 6));
	  System.out.println("Sum of 10.5 + 6.5 = "+ mathsObj.add(10.5f , 6.5f));
	  
	  
   }

}
