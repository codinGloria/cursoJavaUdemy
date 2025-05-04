package trabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Oiii", "Tudo bem?", "Te amo"};
		
		String path ="C:\\Users\\Glória\\eclipse-workspace\\cursoNelio\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
