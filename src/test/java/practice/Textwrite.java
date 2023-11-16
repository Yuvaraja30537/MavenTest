package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

@Test
public class Textwrite {

	private static void write() throws IOException {
		
		File loc = new File("./data/write.txt");
		FileWriter w = new FileWriter(loc);
		BufferedWriter b = new BufferedWriter(w);
		b.write("Hi");
		b.newLine();
		b.write(2);
		b.newLine();
		b.write("Thank you");
		System.out.println("Done");
		b.close();
		
	}
	public static void main(String[] args) throws IOException {
		write();
	}
	
}
