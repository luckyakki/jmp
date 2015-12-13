package com.luckymart.jmp;

public class Passingparameters17 {

	public static void main(String[] args) {
		sayhello("sap");
		sayhello("lucky");
		Add(60,70);
	   int c = Sub(50,40);
	  System.out.println(c);
	   int ans= mul(4,6);
	   System.out.println(ans);
	   double e = div(10,3);
	   System.out.println(e);
	   
	    }
	public static void sayhello(String name){ // inside brackets parameter passing //
		System.out.println("Hello "+ name);
	    }
	
	public static void Add(int a,int b){
		System.out.println(a+b);
	    }
	
	public static int Sub(int a,int b){
		return(a-b);
		}
	
	public static int mul(int a ,int b){
		return(a*b);
	    }
	
	public static double div(double a,double b){
		
		return(a/b);
	    }
	
  }
