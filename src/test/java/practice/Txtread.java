package practice;

import java.io.FileReader;
import java.io.IOException;

public class Txtread {

	private void txt() throws IOException {
		FileReader loc = new FileReader("./data/hi.txt");
		int i;
		while ((i=loc.read()) !=-1) {
			
			System.out.println(i);
			
		}
		
		
		
	}
}
