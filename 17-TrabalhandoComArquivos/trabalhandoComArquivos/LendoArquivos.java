package trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivos {

	public static void main(String[] args) {
		
		Scanner sc = null;
		File file = new File("c:\\Users\\Glória\\Desktop\\teste.txt");
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			if( sc != null) {
			sc.close();
			}
		}
		
	}
}
