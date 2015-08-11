package com.luckymart.jmp;

public class Sswitchstmt {

	public static void main(String[] args) {
		 int score = 75;
		
		 switch (score)
		{
		 case 90 :
			 System.out.println("very good");
			 break;
			 
		 case 70 :
		 case 75 :
		 case 77:
			 System.out.println("good");
			 break;
			 
		 case 50 :
			 System.out.println("ok");
			 break;
			 
			 default :
				 System.out.println("the grades are not defined");
				 break;
			 
		}
		 // switch stmt can be used for multiple expression to check //
	}
 
}
