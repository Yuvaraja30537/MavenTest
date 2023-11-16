package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Flushindatadriven {

	public static void flush() {
		String a = "Hello";
		try {
			File d = new File("./data/flush.txt");
			FileWriter s = new FileWriter(d);
			BufferedWriter b = new BufferedWriter(s);
			b.write(a);
			b.flush();
			System.out.println("Nothing");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	public static void main(String[] args) {
		flush();
	}
}
