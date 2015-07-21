package com.luckymart.jmp;

public class Cricket {
	String name; //member varible or instant variable//
	String name1 = "Sachin Tendulkar";
	String name2 = "Ricky Pointing";

	public static void main(String[] args) {
		Cricket sachin = new Cricket();
		sachin.name = "sachin";
		sachin.Bat();
		
		Cricket ponti = new Cricket();
		ponti.name ="ponti";
		ponti.fielding(); 
		
		Cricket obj = new Cricket();
		obj.Batting();
		
	 }
		
	     public void Bat() {
			System.out.println(name + " batting"); }
			
	     public void fielding(){
			System.out.println(name + " fielding"); }
	     
	     public void Batting() {
	    	 System.out.println("----------------------");
				System.out.println(name1 + " batting"); 
				System.out.println(name2 + " batting");		
				System.out.println("----------------------");
	     }
	     
			
	     
}
			
			
			
			
		
		
		
	
	
	

