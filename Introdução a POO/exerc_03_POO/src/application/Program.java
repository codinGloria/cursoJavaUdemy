package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
			
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", student.notaFinal());
		
		if(student.notaFinal() < 60.0) {
			
			System.out.println("REPROVADO.");
			System.out.printf("FALTAM %.2f PONTOS.", student.pontosFaltantes());
			
		}
		else {
						
			System.out.println("APROVADO!");
			
		}
		sc.close();
	
	}

}