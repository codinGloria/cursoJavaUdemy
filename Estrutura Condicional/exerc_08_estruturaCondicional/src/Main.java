import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
        double imposto;

        if (valor > 0.00 && valor <= 2000.00) {

        	System.out.println("Isento");

        } 
        else if (valor > 2000.00 && valor <= 3000.00) {

            valor = valor - 2000.00;
            imposto = valor * 0.08;
            System.out.printf("R$ %.2f%n", imposto);

        } 
        else if (valor > 3000.00 && valor <= 4500.00) {

            valor = valor - 3000.00;
            imposto = 1000.00 * 0.08 + valor * 0.18;
            System.out.printf("R$ %.2f%n", imposto);

        } 
        else {

            valor = valor - 4500.00;
            imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + valor * 0.28;
            System.out.printf("R$ %.2f%n", imposto);

        }
		
		sc.close();		

	}

}
