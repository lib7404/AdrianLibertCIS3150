//HW 2 Question # 2
//Created by Adrian Libert Id# 15335616

import java.util.*;


public class HW2Question2 {

	
	
		public static boolean isLeapYear(int year) { 
			if ((year % 4 == 0) && (year % 100 != 0)) {
				return true; 
			}
			if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		
		
	public static void main(String[] args) {
		
		//Now we get the user input.
		Scanner keyboardInput = new Scanner(System.in);
		
		//Get the year
		System.out.println("[*] Please enter the 4 digit year => ");
		int year = keyboardInput.nextInt();
		
		System.out.println("[*] Please enter the day the 1st of January fell on ");
		System.out.println("[*][*] 1 - Sunday ");
		System.out.println("[*][*] 2 - Monday ");
		System.out.println("[*][*] 3 - Tuesday ");
		System.out.println("[*][*] 4 - Wednesday ");
		System.out.println("[*][*] 5 - Thursday ");
		System.out.println("[*][*] 6 - Friday ");
		System.out.println("[*][*] 7 - Saturday ");
		
		int day = keyboardInput.nextInt();
		
		//generateCalendar(year, day);
		
		String[] theMonths = new String[13];
		//Populate the string array
		theMonths[0] = "NOT IN USE";
		theMonths[1] = "January";
		theMonths[2] = "February";
		theMonths[3] = "March";
		theMonths[4] = "April";
		theMonths[5] = "May";
		theMonths[6] = "June";
		theMonths[7] = "July";
		theMonths[8] = "August";
		theMonths[9] = "September";
		theMonths[10] = "October";
		theMonths[11] = "November";
		theMonths[12] = "December";
		
		//As per month - 13 entries
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		
		//Print the first part of the calendar
		for (int i = 1; i < theMonths.length; i++) {
		
			if (i == 2 && isLeapYear(year)) {
				days[2] = 29;
			}
		
		
			System.out.println(" " + theMonths[i] + " " + year);
			System.out.println("S  M  Tu  W  Th  F  S");
			
			for (int j = 0; j < day; j++) {
				System.out.print("  ");
			
			}
			
			for (int k = 1; k <= days[i]; k++) { //Print out each day for the current month
				System.out.printf("%2d ", k);
				if (((k + day) % 7 == 0) || (k == days[i])) {
					System.out.println(); //Wrap to the next line when appropriate.
				}
			}
					
		}
	}
}