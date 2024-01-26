import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFunc = sc.nextInt();
		int horasTrab = sc.nextInt();
		double valor = sc.nextDouble();
		
		double salario = valor * horasTrab;
		
		System.out.printf("NUMBER: %d%n", numeroFunc);
		System.out.printf("SALARY: U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
