import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double media=0, soma=0;
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Digite um número: ");
			vect[i]= sc.nextDouble();	
			
		}
			
	    for (int i=0; i<n; i++) {
	        soma = soma + vect[i];
	    }

	    media = soma / n;

	    System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
	    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

	    for (int i=0; i<n; i++) {
	        if (vect[i] < media) {
	        	System.out.printf("%.1f\n", vect[i]);
	        }
	    }

		sc.close();

	}

}
