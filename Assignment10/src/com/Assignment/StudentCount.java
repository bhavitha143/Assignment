package com.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StudentCount {
	
	public static void main(String[] args) throws Exception {
	File file = new File("C:\\Users\\gbhavith\\eclipse-workspace");
	String st;
	//opens a file in read mode
	//FileReader file = new FileReader("Students data.txt");
	BufferedReader br = new BufferedReader(new FileReader(file));
	//Gets each line till end of file is reached
	while((st=br.readLine())!=null)
	System.out.println(st);
	}
	}




