//HW 4 Question
//Created by Adrian Libert Id# 153356160

//package MyString;


public final class MyString {

	public char[] theInput;
	public int theLength = 0;
	
	public MyString(char[] chars) {
		//Populate theLength.
		theLength = chars.length; //We will use the arrays built 
		//Populate theInput
		theInput = new char[theLength];
		for (int i = 0; i < chars.length; i++) {
			theInput[i] = chars[i]; 
		
		}
		
		
	}
	
	public final char charAt(int index) {
		char theChar;
		theChar = this.theInput[index];
		return theChar;
	}
	
	public final int length() {
		return this.theLength;
	
	}
	
	public final MyString substring(int begin, int end) {
		int tempLength = end - begin;
		//Test of theInput
		
		for (int i = begin; i < end; i++) {
			System.out.print(theInput[i]);
		
		}
		System.out.println();
	
		
		char[] temp = new char[tempLength];
		/**
		System.out.println("Substring length: " + temp.length);
		for (int i = begin; i < tempLength; i++) {
			//Testing 
			System.out.println("Current value of i is: " + theInput[i]);
			temp[i] = theInput[i];
		
		}
		*/
		MyString theString = new MyString(temp);
		/**
		for (int i = 0; i < temp.length; i++) {
			char tempChar = temp[i];
			theString(i) = tempChar;
		
		}
		*/
		return theString;
		
	}
		
	
	public final MyString toLowerCase() {
		MyString theString;
		char[] temp = new char[theInput.length];
		char[] engLower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] engUpper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		for (int i = 0; i < this.theInput.length; i++) {
			for (int j = 0; j < this.theInput.length; j++) {
			
				if (this.theInput[i] == engUpper[j]) {
					this.theInput[i] = engLower[j];
					
				} 
			}
			
				
		}
		
		//Build the new string
		for (int i = 0; i < theInput.length; i++) {
			temp[i] = theInput[i];
		}
		theString = new MyString(temp);
	
		return theString;
	
	}
	
	public final MyString toUpperCase() {
		MyString theString; 
		char[] temp = new char[theInput.length];
		char[] engLower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] engUpper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		for (int i = 0; i < this.theInput.length; i++) {
			for (int j = 0; j < this.theInput.length; j++) {
			
				if (this.theInput[i] == engLower[j]) {
					this.theInput[i] = engUpper[j];
				} 
			}
			
			
		}
		
		//Build the new string
		for (int i = 0; i < theInput.length; i++) {
			temp[i] = theInput[i];
		}
		theString = new MyString(temp);
	
		
		return theString;
	
	}
	
	public final boolean equals(MyString s) {
		int charCount = 0;
		//System.out.println(s.length());
		//Check to see if the length is the same first
		if (theInput.length == s.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (this.theInput[i] == s.charAt(i)) {
					charCount++;
				}
			}
		} else {
			return false;
		}
		
		if (charCount == s.length()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public final  MyString getMyString() {
		MyString theString;
		char[] temp = new char[theInput.length];
		for (int i = 0; i < theInput.length; i++) {
			System.out.print(theInput[i]);
		
		}
		System.out.println();
	
		return theString = new MyString(temp);
	
	}
	
	
	public final String toString() {
		/**
			for (int i = 0; i < theInput.length; i++) {
				System.out.print(theInput[i]);
			}
			System.out.println();
			
		*/
			String theString = new String(theInput);
			return theString;
			
	}
	
	
	public final MyString valueOf(int i) {
		MyString theString;
		
		char[] temp = new char[1];
		temp[0] = theInput[i];		
		theString = new MyString(temp);
		
		
		
		return theString;
	
	}




	public static void main(String[] args) {
		
		char[] data = {'T','H','E',' ', 'r','e','d',' ','D','e','s','k'};
		char[] data2 = {'S','t','a','r'};
		
		
		MyString mystring = new MyString(data);
		MyString mystring2 = new MyString(data2);
		//Test
		/**
		System.out.println("The original line is below:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		*/
		
		System.out.println();
		System.out.println("Test of getMyString (the original MyString) below:");
		System.out.println(mystring.getMyString());
		
		
		System.out.println("Test of charAt (the third position) below:");
		System.out.println(mystring.charAt(2));
		
		
		System.out.println("Test of substring (the 2nd to 7th positions) below:");
		
		System.out.println(mystring.substring(2, 7));
		
		
		System.out.println("Test of valueOf (the 5th position) below:");
		System.out.println(mystring.valueOf(4));
		
		System.out.println("Test of equals and toString (Note: they should not) below:");
		System.out.println("The first variable is: " + mystring.toString());
		System.out.println("The second variable is: " + mystring2.toString());
		boolean answer = mystring.equals(mystring2);
		System.out.println("Are they the same? " + answer);
		
		
		System.out.println("Test of toLowerCase below:");
		System.out.println(mystring.toLowerCase());
		
		System.out.println("Test of toUpperCase below:");
		System.out.println(mystring.toUpperCase());
		
		
		
	
	
	}


}