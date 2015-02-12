//HW 2 Question # 1
//Created by Adrian Libert Id# 15335616


import java.util.*;


public class HW2Question1 {

	public static void generateTriangle(int height) {
		System.out.print("\n\n");
		
			
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height*2+1; j++) {
				int midPoint = (height - j);
				if (midPoint < 0) {
					midPoint = midPoint * -1;
				}
				System.out.print(midPoint > i? " " : i - midPoint + 1);
					
			}
			

			System.out.println();
					
		
		}
		
	
	}






	public static void main(String[] args) {
	
		System.out.println("[*] Please enter the height of the triangle - INTEGER value only => ");
		
		//Now we get the user input.
		Scanner keyboardInput = new Scanner(System.in);
		
		//Variable to store user entry
		int level = 0;
		
		//Store the user input
		level = keyboardInput.nextInt();
		
		generateTriangle(level);
		
	
	
	}

}
