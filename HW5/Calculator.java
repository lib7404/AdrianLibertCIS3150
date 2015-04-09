//HW 5 Question
//Created by Adrian Libert Id# 153356160

import java.util.*;
import java.io.*;

public class Calculator {

	public static boolean numericCheck(String data) throws NotANumberException {
			if (!(Double.parseDouble(data))) {
				throw new NotANumberException(); 
				return false;
			} else {
				return true;
			}
	}
	
	public static boolean operatorCheck(String operator) throws IllegalOperationException {
		if (!(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*") || operator.equals("%"))) {
			throw new IllegalOperationException();
			
			return false;
		} else {
			return true;
		}
	
	}
	
	
	public static boolean enoughNumbersCheck(String[] args) throws NotEnoughNumbersException {
		if (!(args.length <= 3)) {
			throw new NotEnoughNumbersException();
			
			return false;
		} else {
			return true;
		}
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		//First check to see if we have the minimum length
		try {
			enoughNumbersCheck(args);
		} catch (NotEnoughNumbersException nenum) {
			System.out.println("ERROR, Please try again with the proper number of entries");
		}
		
		try {
		
		} catch (IllegalOperationException ioe) {
			System.out.println("ERROR, Please enter a supported operator");
		
		}
		
	


	
			//Check to make sure that we have integers or doubles
			try { 
				if (numericCheck(args[0]) && numericCheck(args[2])) {
			
					if (args[1].equals("+")) {
						System.out.println(Double.parseDouble(args[0]) + Double.parseDouble(args[2]));
					} else if (args[1].equals("-")) {
						System.out.println(Double.parseDouble(args[0]) - Double.parseDouble(args[2]));
					} else if (args[1].equals("/")) {
						System.out.println(Double.parseDouble(args[0]) / Double.parseDouble(args[2]));
					} else if (args[1].equals("*")) {
						System.out.println(Double.parseDouble(args[0]) * Double.parseDouble(args[2]));
					} else if (args[1].equals("%")) {
						System.out.println(Double.parseDouble(args[0]) % Double.parseDouble(args[2]));
					}
				}
			} catch (NotANumberException nan) {
				System.out.println("ERROR, integer or double not entered");
			}	 
			
			
			
		
					
		}
		
	}
	
	
	
	
	
	
	

class NotANumberException extends IlleglArgumentException{}

class IllegalOperationException extends IlleglArgumentException{}

class NotEnoughNumbersException extends IlleglArgumentException{}


