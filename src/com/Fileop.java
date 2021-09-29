package com;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fileop {
	public static void listFilesInDirectory(String path, int indentationCount) {
		File dir = new File(path);
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {

            	System.out.print(" "+(indentationCount*2));


            	if (file.isDirectory()) {  
            		System.out.println("`-- " + file.getName());

            		// Recursively indent and display the files
                	listFilesInDirectory(file.getAbsolutePath(), indentationCount+1);
                }  else {
                	System.out.println("|-- " + file.getName());
                }
            }
        } else {
        	System.out.print(" "+(indentationCount*2));
        	System.out.println("|-- Empty Directory");
        }
        System.out.println();
	}
}
	//public static void listFilesInDirectory(String path, int indentationCount) {
		public static List<String> listFilesInDirectory(String path, int indentationCount, List<String> fileListNames) {
			File dir = new File(path);
	        File[] files = dir.listFiles();

	        List<File> filesList = Arrays.asList(files);

	        Collections.sort(filesList);

	        if (files != null && files.length > 0) {
	            //for (File file : files) {
	            for (File file : filesList) {

	            	System.out.print(" "+(indentationCount*2));


	            	if (file.isDirectory()) {  
	            		System.out.println("`-- " + file.getName());

	            		// Recursively indent and display the files
	                	//listFilesInDirectory(file.getAbsolutePath(), indentationCount+1);
	            		fileListNames.add(file.getName());
	                	listFilesInDirectory(file.getAbsolutePath(), indentationCount+1, fileListNames);
	                }  else {
	                	System.out.println("|-- " + file.getName());
	                	fileListNames.add(file.getName());
	                }
	            }
	        } else {
	        	System.out.print(" "+(indentationCount*2));
	        	System.out.println("|-- Empty Directory");
	        }
	        System.out.println();
	        return fileListNames;
		}


	} 