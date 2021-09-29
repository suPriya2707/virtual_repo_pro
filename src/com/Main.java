package com.project1;
import java.util.Scanner;
public class ProjectMain {

	public static void main(String[] args){

		MenuOptions.printWelcomeScreen("VirtualPro", "Supriya");
		MenuOptions.printWelcome("VirtualPro", "Supriya");
		handleWelcomeScreenInput();
	}
	private static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOP.displayMenu();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					//FileOperations.displayAllFiles("./main");
					Fileop.displayAllFiles("main");
					break;
				case 2:
					MenuOP.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
}