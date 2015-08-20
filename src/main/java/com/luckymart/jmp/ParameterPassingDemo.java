package com.luckymart.jmp;

public class ParameterPassingDemo 
{
	// instance variable
	int sum;     

	//instance method
	public  int add(int a , int b){
		int c =  a+b;
		return c;
	}

  //main method
	public static void main(String args[]){
		
		ParameterPassingDemo obj1 = new ParameterPassingDemo();
		obj1.sum = obj1.add(10,20);
		System.out.println("Obj1 Sum = "+obj1.sum);
		
		ParameterPassingDemo obj2 = new ParameterPassingDemo();
		obj2.sum = obj2.add(100,200);
		System.out.println("Obj2 Sum = "+obj2.sum);
		
		ParameterPassingDemo obj3 = new ParameterPassingDemo();
		obj3.sum = obj3.add(1000,2000);
		System.out.println("Obj3 Sum = "+obj3.sum);
		
	}

}
