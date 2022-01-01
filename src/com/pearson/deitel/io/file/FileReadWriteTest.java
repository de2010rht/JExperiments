package com.pearson.deitel.io.file;

public class FileReadWriteTest {

	public static void main(String[] args) {
		FileCreate create = new FileCreate();
		create.createFile();
		
		FileRead read = new FileRead();
		read.readFile();
	}

}
