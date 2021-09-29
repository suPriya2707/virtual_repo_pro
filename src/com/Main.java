package com;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Welcome.printWelcome("Virtual Key Repository", "Pavithra");
		//Welcome.printWelcome("Virtual Key Repository", "Pavithra");
		MenuOP.printWelcome("Virtual Key Repository", "Pavithra");
		handleWelcomeScreenInput();
	}

	private static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);

		do {
			MenuOP.displayMenu();
			int input = sc.nextInt();

			switch (input) {
			case 1:
				// All required files and folders inside main folder relative to current folder
				Fileop.listFilesInDirectory("./main", 0);
				break;
			case 2:
				MenuOP.displayFileMenuOptions();
				break;

			case 3:
				System.out.println("Program exited successfully.");
				System.exit(0);
				break;
			default:
				System.out.println("Please select a valid option from above.");
			}
		} while (running == true);

		sc.close();

	}

}

	