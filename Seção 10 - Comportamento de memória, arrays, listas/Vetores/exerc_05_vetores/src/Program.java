import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		double maiorValor;
		int posicao = 0;
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Digite um número: ");
			numeros[i]= sc.nextDouble();

		}
		
		maiorValor = numeros[0];
		
		for(int i=1; i<n; i++) {
			
			if (numeros[i] > maiorValor) {
				
	            maiorValor = numeros[i];
	            posicao = i;
	            
	        }
			
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);			
		
		sc.close();

	}

}
