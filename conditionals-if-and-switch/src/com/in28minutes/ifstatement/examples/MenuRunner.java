package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	private static int case1;

	public static void main(String[] args) {
		
		// When you creating an object
		// Type object = new Type();
		// Scanner is a built in class in Java

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter number2: ");
		int number2 = scanner.nextInt();

		System.out.println("Choices Available are ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4- Multiply");

		System.out.println("Enter choice: ");
		int choice = scanner.nextInt();

		System.out.println("Your choices are ");
		
		System.out.println("Number1 " + number1);
		System.out.println("Number2 " + number2);
		System.out.println("Choice " + choice);
	
	performOperationUsingSwitch(number1, number2, choice){


	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
	
         switch(choice) {
         case1:
         
             System.out.println("result " + (number1 + number2));
             break;
         case2:   
		
			System.out.println("result " + (number1 - number2));
         break;
             
         case3:
			System.out.println("result " + (number1 / number2));
           break;

         case4:
           
			System.out.println("result " + (number1 * number2));
               break;
         
	    default:
		    System.out.println("Invalid Operation");
         }
         }
	}



