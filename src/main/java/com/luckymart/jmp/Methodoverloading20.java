package com.luckymart.jmp;
/*In java defines two or more method within the same class that shares the same names but different parameters". It is called the overloading methods. 
Methods with the same name in a class are called overloaded methods*/
public class Methodoverloading20 {

	public static void main(String[] args) {
		System.out.println("Add "+ "= " + Add(4,5));
		System.out.println("Add "+ "= " + Add(4,5.1));
		System.out.println("Add "+ "= " + Add("hi","sap"));
        }
	
	public static int Add(int a,int b){
		return(a+b);
		}
    public static double Add(int a,double b){
        return(a+b);
        }
    public static String Add(String a,String b){
    	return(a+b);
       }
}

