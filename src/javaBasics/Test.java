package javaBasics;

import java.util.Calendar;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercise Age calculator 
		
		System.out.print("Enter your birth year ");
		Scanner sc = new Scanner(System.in);
		int birthYear = sc.nextInt();
		// Get current year automatically
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("Your Age is : "+(currentYear-birthYear)+" years old");
	
		// Order of operations : %(modulo) --> / --> * --> + --> -
		System.out.println("Modulo : "+80%9);
	}

}
