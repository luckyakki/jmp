package com.luckymart.jmp;

class C{
		int i;
		 int j;
		void setij(int x,int y){
			
		i = x;
		j = y;
	}
}
  class D extends C {
	  int total;
	  void sum(){
		  total = i+j;
		  
	  }
	  
  }
  public class Access {
	  public static void main(String[] args) {
		D subob = new D();
		subob.setij(11, 22);
		subob.sum();
		System.out.println("Total is " + subob.total);
		
		
		
	}
  }