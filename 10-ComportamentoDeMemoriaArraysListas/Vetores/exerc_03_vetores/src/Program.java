import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		int menores =0;
		double alturaTotal =0, alturaMedia, percentual;  	
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("Dados da %da pessoa:\n", i +1);
			System.out.println("Nome: ");
			nomes[i]= sc.next();
			System.out.println("Idade: ");
			idades[i]= sc.nextInt();
			System.out.println("Altura: ");
			alturas[i]= sc.nextDouble();
			
		}
		
		for(int i=0; i<n; i++) {
			
			if(idades[i] < 16) {
				
				menores++;
				
			}
			
			alturaTotal = alturaTotal + alturas[i];
			
		}
		
		alturaMedia = alturaTotal / n;
		percentual = ((double) menores / n) * 100.0;
		
		System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
		
		for(int i=0; i<n; i++) {
			
			if (idades[i] < 16) {
				
				System.out.printf("%s\n", nomes[i]);
				
		    }
			
		}
		
		sc.close();

	}

}
