import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double soma = 0, media;
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Digite um número: ");
			vect[i]= sc.nextDouble();
			
		}
		
		for (int i=0; i<n; i++) {
			
		       soma = soma + vect[i];
		       
		}
		
		media = soma / n;
		
		
		System.out.print("VALORES = ");
		
		for (int i = 0; i<n; i++) {
			
			System.out.printf("%.1f ", vect[i]);
			
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n ", media);
		
		sc.close();

	}

}