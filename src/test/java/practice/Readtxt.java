package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readtxt {
	public static void rea() throws IOException {
		File file = new File("./data/hi.txt");
		FileReader read = new FileReader(file);
		BufferedReader reader = new BufferedReader(read);
		String readLine = reader.readLine();
		System.out.println("Single line read: " + readLine);
		reader.close();
	}

	public static void mul() throws IOException {
		File w = new File("./data/hi.txt");
		FileReader g = new FileReader(w);
		BufferedReader fe = new BufferedReader(g);
		String re = null;
		while ((re = fe.readLine()) != null) {
			System.out.println(re);
		}
		fe.close();

	}

	public static void main(String[] args) throws IOException {
		rea();
		mul();
	}

}
