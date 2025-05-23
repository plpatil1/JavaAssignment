package io_programming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadExampleUsingBufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/resources/technologies.txt";
		
		try(FileInputStream fin = new FileInputStream(filePath);
				BufferedInputStream bin = new BufferedInputStream(fin)) {
			//Resource is initialized and instantiated
			while(true) {
				//Read the content character by character using read()
				int data = bin.read();//Resource is getting used
				//The read() method reads 1 character and returns its value and shifts the pointer 1 step ahead
				//When EOF is encountered, the method returns -1
				if(data == -1)
					break;
				char ch = (char)data;
				System.out.print(ch);				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





