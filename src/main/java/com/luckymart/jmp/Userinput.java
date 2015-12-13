package com.luckymart.jmp;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		 
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);//create a scanner obj
		
		System.out.println("enter a line of text :");//output the prompt
		String name = input.nextLine();//wait for the user to enter a line of text
		
		System.out.println("you entered: "+ name);//tell them to what they entered
		
		
		
	
	}

}
