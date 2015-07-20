package com.luckymart.jmp;

public class Actor {

	public static void main(String[] args) {
		Actor chiranjeevi = new Actor();
		Actor nagarjuna = new Actor();
		
		String message = chiranjeevi.act("Chiranjeevi");
		System.out.println(message);
		message = nagarjuna.act("Nagarjuna");
		System.out.println(message);
	}
	public String act(String name){
		String whoisacting = name+ " is acting...";
		return whoisacting;
	}


		
	
	
	
	
		
				
		
		
	}
	
	

