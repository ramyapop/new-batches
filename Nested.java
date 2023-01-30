package com.Package;

public class Nested {
	public static void main(String[] args) {
		
		System.out.println("start");
		for (int i = 1; i <=5; i++) {//row
			
			for (int j = 1; j <=i; j++) {//coloumn
			
				System.out.print("*"+" ");	
			}
		System.out.println();
		}
		System.out.println("end");
	}

} 
