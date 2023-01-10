import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double soma1 = valor1 * num1;
		double soma2 = valor2 * num2;
		
		double total = soma1 + soma2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	
	}

}
