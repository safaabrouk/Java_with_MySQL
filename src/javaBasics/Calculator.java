package javaBasics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, op, result = 0;
		Scanner sc = new Scanner(System.in);
		String[] operations = {"","+","-","*","/","%"};
		String ansewer;
		
		loop1:
		while(true) {

			System.out.println(" *********** Operations *********** ");
			System.out.println(" * 1. Addition (+)                * ");
			System.out.println(" * 2. Subtraction (-)             * ");
			System.out.println(" * 3. Multiplication (*)          * ");
			System.out.println(" * 4. Division (/)                * ");
			System.out.println(" * 5. Modulo (%)                  * ");
			System.out.println(" * 0. Exit                        * ");
			System.out.println(" ********************************** ");
			
			loop2:
			do {
				
				System.out.print("Enter number of operation: ");
				op = sc.nextInt();
				
				if(op == 0) {
					
					System.out.print("Are you sure ? (Ansewer by yes or no)");
					ansewer = sc.next();
					
					// For breaking loop has loop1 as label 
					if(ansewer.equals("yes")) {
						System.out.println("GoodBye !!!");
						break loop1;
						}
					else continue loop2;
					
				}
				
			}while(op>5 || op<=0);
					
			System.out.print("Enter fisrt number: ");
			x = sc.nextInt();
			System.out.print("Enter second number: ");
			y = sc.nextInt();
			
			switch(op) {
				case 1 : 
					result = x+y;
				break;
				case 2 : 
					result = x-y;
				break;
				case 3 : 
					result = x*y;
				break;
				case 4 : 
					result = x/y;
				break;
				default : 
					result = x%y;
				break;
			}
			
			System.out.println("Final result of "+x+""+operations[op]+""+y+"="+result);
			
	}

}

}
