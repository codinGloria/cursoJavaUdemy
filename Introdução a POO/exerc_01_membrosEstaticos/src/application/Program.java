package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o preço do dolar?");
		double valor = sc.nextDouble();
		System.out.println("Quantos dolares serão comprados?");
		double dolar = sc.nextDouble();
		double total = CurrencyConverter.Converter(valor,dolar);
		System.out.printf("Quantia a ser paga em reais: %.2f%n", total);

		sc.close();
		
	}

}
