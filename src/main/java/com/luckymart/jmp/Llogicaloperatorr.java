package com.luckymart.jmp;

public class Llogicaloperatorr {

	public static void main(String[] args) {
		//if u want to evaluate more than 1 condition in if stmt we can use logical opertor//
		int subject1 = 50;
		int subject2 = 60;
		 
		//  &&-->and operator , ||-->or operator  //
		if ((subject1 >= 77) && (subject2 <=44)) { // T && T -> T
			System.out.println("condition true"); //  T && F    F
		}                                         //  F && T    F
		else {                                    //  F && F    F
			System.out.println("condition false");
		}
		if ((subject1 >=22) || (subject2 >=22)){ //
			System.out.println("condition true");
		
		}
		else{
			System.out.println("condition false"); // T || T -> T
			                                       // T || F    T
					                               // F || T    T
		}                                          // F || F    F
			
	}

}
