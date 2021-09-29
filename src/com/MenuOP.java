package com;
import java.util.Scanner;
import java.util.List;

public class MenuOP {

	public static void printWelcome(String appName, String developerName) {
	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("*****************************************************\n"
				//+ "** Welcome to %s.com. \n"
				//+ "** This application was developed by %s.\n"
				//+ "*****************************************************\n", appName, developerName);
+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
+ "*****************************************************\n", appName, developerName);
String appFunction = "You can use this application to :-\n"
//+ "• Retrieve all file names in the \"main\" folder\n"
//+ "• Search, add, or delete files in \"main\" folder.\n"
//+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
+ "• Retrieve all file names in the \"main\" folder\n"
+ "• Search, add, or delete files in \"main\" folder.\n"
+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
System.out.println(companyDetails);
				+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
				+ "*****************************************************\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "• Retrieve all file names in the \"main\" folder\n"
				+ "• Search, add, or delete files in \"main\" folder.\n"
				+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(companyDetails);
		System.out.println(appFunction);
	}
	public static void displayMenu() {
		String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);
	}
	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";
		System.out.println(fileMenu);
	}
	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				displayFileMenuOptions();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					break;
				case 2:
					System.out.println("Enter the name of the file to be deleted from \"main\" folder");
					String fileToDelete = sc.next();

					List<String> filesToDelete = FileOperations.displayFileLocations(fileToDelete, "main");

System.out.println(appFunction);
}
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);

					int idx = sc.nextInt();

public static void displayMenu() {
String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
//+ "1) Retrieve all files inside \"main\" folder\n"
//+ "2) Display menu for File operations\n"
//+ "3) Exit program\n";
+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
+ "3) Exit program\n";
System.out.println(menu);
					if (idx != 0) {
						Fileop.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {

						// If idx == 0, delete all files displayed for the name
						for (String path : filesToDelete) {
							Fileop.deleteFileRecursively(path);
						}
					}

}

					break;
				case 3:
					System.out.println("Enter the name of the file to be searched from \"main\" folder");
					String fileName = sc.next();
					//FileOperations.displayFileLocations(fileName, "./main");
					FileOperations.displayFileLocations(fileName, "main");

public static void displayFileMenuOptions() {
//String fileMenu = "****** Select any option number from below ******\n\n"
//+ "1) Add a file to \"main\" folder\n"
//+ "2) Delete a file from \"main\" folder\n"
//+ "3) Search for a file from \"main\" folder\n"
//+ "4) Show Previous Menu\n"
//+ "5) Exit program\n";

String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

System.out.println(fileMenu);
}

public static void handleFileMenuOptions() {
boolean running = true;
Scanner sc = new Scanner(System.in);
do {
try {
displayFileMenuOptions();
int input = sc.nextInt();
switch (input) {
case 1:
break;
case 2:
break;
case 3:
System.out.println("Enter the name of the file to be searched from \"main\" folder");
String fileName = sc.next();
Fileop.displayFileLocations(fileName, "./main");
break;
case 4:
return;
case 5:
System.out.println("Program exited successfully.");
running = false;
sc.close();
System.exit(0);
default:
System.out.println("Please select a valid option from above.");
}
} catch (Exception e) {
System.out.println(e.getClass().getName());
handleFileMenuOptions();
}
} while (running == true);
}
}
					break;
				case 4:
					return;
				case 5:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (running == true);
	}
} 