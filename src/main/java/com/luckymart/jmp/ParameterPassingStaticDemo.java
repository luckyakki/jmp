package com.luckymart.jmp;

public class ParameterPassingStaticDemo {

	//Declare and initialize static and a non-static variable with default value 0
	       int nonstaticsum = 0;
	static int staticsum = 0;

	public static void main(String args[]){

		//create 3 objects
		ParameterPassingStaticDemo obj1 =  new ParameterPassingStaticDemo();
		ParameterPassingStaticDemo obj2 =  new ParameterPassingStaticDemo();
		ParameterPassingStaticDemo obj3 =  new ParameterPassingStaticDemo();


		//Add 10 to the  non-static variable
		obj1.nonstaticsum = obj1.nonstaticsum+10;;
		System.out.println("obj1.nonstaticsum = "+obj1.nonstaticsum);
		obj2.nonstaticsum = obj2.nonstaticsum+10;
		System.out.println("obj2.nonstaticsum = "+obj2.nonstaticsum);
		obj3.nonstaticsum = obj3.nonstaticsum+10;;
		System.out.println("obj3.nonstaticsum = "+obj3.nonstaticsum);

		//Add 10 to the static variable
		obj1.staticsum = obj1.staticsum+10;
		System.out.println("obj1.staticsum = "+obj1.staticsum);
		obj2.staticsum = obj2.staticsum+10;
		System.out.println("obj2.staticsum = "+obj2.staticsum);
		obj3.staticsum = obj3.staticsum+10;
		System.out.println("obj3.staticsum = "+obj3.staticsum);


	}

}
