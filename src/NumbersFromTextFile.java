import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumbersFromTextFile {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:/file.txt"));
			String line = null;
			int sum = 0;
			while ((line = reader.readLine()) != null) {
				sum += Integer.parseInt(line);
			}
			System.out.println(sum);
		} catch (FileNotFoundException  e) {
			System.out.println("Error");
		}
		
	}
}
