package com.luckymart.jmp;

public class Cricket {
	String name; //member varible or instant variable//

	public static void main(String[] args) {
		Cricket sachin = new Cricket();
		sachin.name = "sachin";
		sachin.Bat();
		
		Cricket ponti = new Cricket();
		ponti.name ="ponti";
		ponti.fielding();  }
		
	     public void Bat() {
			System.out.println(name + " batting"); }
			
	     public void fielding(){
			System.out.println(name + " fielding"); }
			
	     
}
			
			
			
			
		
		
		
	
	
	

