package com.luckymart.jmp;
                                             // programming knowledge //
public class Myclass21 {
	// static keyword: static member belong to the class instead of specific instance //
  public static void main(String[] args) {
	 System.out.println(Hello21.Dosomething("static"));
	 
	 String returnedMsg = Hello21.Dosomething("Static Metod Call - Hello Shai Krishna");
	 System.out.println(returnedMsg);
	 
	  Hello21 hello = new Hello21();
	  String returnedMsg2 = hello.Dosomethingelse("NonStatic Metod Call - Hello Shai Krishna");
	  System.out.println(returnedMsg2);
	 
	 
	  System.out.println( Hello21.age);
	  
	  
	  
	  
	  
		

	}

}
