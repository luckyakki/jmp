package com.luckymart.jmp;

public class Array {  
	/* Array is same like  variable but if u want to store more than one value at a time but the only 1 condition 
	is u can store same kind of datatype  means u can store 5 integers n0t 5 integers ,5 doubls*/

	public static void main(String[] args) {
		int myintarray[] = {1,2,3,4,5};   
		                                  /* 1,2,3,4,5  --> elements of array 
		                                   index of array starts from 0
		                                        index means position of elements 
		                                        index of 1 --> 0
		                                                2 --> 1 */
		                                  /* declaration of array in different ways
                                            * int[] myintarray = new int[3]
                                            * int[] myintarray = {1,2,3};
                                            * int[] myintarray = new int[]{1,2,3} */
    int index = 0;
		while(index<5){
    	System.out.println(myintarray[index]);
		 index++;
		 
    }

	}	

}
