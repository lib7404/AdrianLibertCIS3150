//HW 7 Question
//Created by Adrian Libert Id# 153356160


import java.util.*;
import java.io.*;

public class Directory {

	public static void main(String[] args) {
		//The starting point
		File startingDir = new File(args[0]);
		walkTheDirectory(startingDir);
		System.out.println();
		System.out.println();

	}

	public static void walkTheDirectory(File startingDir) {

		//System.out.println("We are starting at " + startingDir);
		File theDirectories[] = startingDir.listFiles(File::isDirectory);

		for (int i=0; i < theDirectories.length; i++) {

			if (theDirectories[i].isDirectory()) {

				System.out.println("[*]" + theDirectories[i].getName());
				//Now create the subdirectories
				File theSubDirectories[] = theDirectories[i].listFiles(File::isDirectory);
				for (int j=0; j<theSubDirectories.length; j++){

					System.out.println("[---->" + theSubDirectories[j].getName());
				}

				//Now do a recursive call to get each directory
				
				walkTheDirectory(theDirectories[i]);
			
			}
		}

	}

}
