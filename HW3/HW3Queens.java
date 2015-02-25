//HW 3 Question
//Created by Adrian Libert Id# 15335616

import java.util.*;

public class HW3Queens {


	private int queenId = -1;
	
	
	//Constructor
	public HW3Queens(int id) {
		this.queenId = id;
		
	}
	
	//Accessor and Getter Methods
	public int getQueenId() {
		return this.queenId;
	}
	
	public void updateQueenId(int value) {
		this.queenId = value;
	}


	//Methods checks if each queen can be safely placed
	public static boolean safeToPlace(int queenPos, int previousIndex, HW3Queens[] queens) {
		for (int i = 0; i < queenPos; i++) {
			//if (queens[i].getQueenId() == previousIndex || (i - queenPos) == (queenPos - previousIndex) || (i - queenPos) == (previousIndex - queens[i].getQueenId())) {
			if (queens[i].getQueenId() == previousIndex || (i - queenPos) == (queens[i].getQueenId() - previousIndex) || (i - queenPos) == (previousIndex - queens[i].getQueenId())) {
				//System.out.println("NOT SAFE!!!");
				//System.out.println(queens[i].getQueenId());
				//System.out.println(previousIndex);
				//System.out.println(i);
				//System.out.println(queenPos);
				return false;
			}
		
		}
		//System.out.println("SAFE.");
		return true;
	}
	
	
	public static void printTheBoard(HW3Queens[] queens) {
		for (int i = 0; i < queens.length; i++) {
			for (int j = 0; j < queens.length; j++) {
				if (queens[i].getQueenId() == j) {
					System.out.print("Q\t");
				} else { 
					System.out.print("|\t");
				}
							
			}
			System.out.println();
		
		}
		System.out.println();
	}
	
	
	
	//Method puts the queens on the "board"
	public static void placeTheQueens(int currentQueenId, int length, HW3Queens[] queens) {
		for (int col = 0; col < length; col++) {
			//if(safeToPlace(currentQueenId, length, queens)) {
			if(safeToPlace(currentQueenId, col, queens)) {
				//System.out.println("placeTheQueens BEFORE update " + queens[currentQueenId].getQueenId());
				queens[currentQueenId].updateQueenId(col);
				//System.out.println("placeTheQueens AFTER update " + queens[currentQueenId].getQueenId());
				if (col == length - 1) {
					//TEST
					//System.out.println("CALLING printTheBoard");
					printTheBoard(queens);
				} else {
					//currentQueenId = currentQueenId + 1;
					placeTheQueens((currentQueenId +1), length, queens);
				}
			}
		}
		
	
	}

	
	public static void main(String[] args) {
	
		HW3Queens[] queens = new HW3Queens[8];
	
		for (int i = 0; i < queens.length; i++) {
			queens[i] = new HW3Queens(i);
			System.out.println("[*] Queen =>  " + i + " has been created and initialized to column " + queens[i].getQueenId());
		}
	
		
		//Call the main algo
		System.out.println();
		int start = 0;
		placeTheQueens(start, queens.length, queens);
		
	
	}

}
