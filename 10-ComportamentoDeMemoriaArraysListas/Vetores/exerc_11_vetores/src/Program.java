import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		int qntdH = 0, qntdM = 0;
		double menorAltura, maiorAltura, alturaMedia;
		double alturaTotal = 0;

		for (int i = 0; i < n; i++) {
			
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
			
		}

		menorAltura = alturas[0];
		maiorAltura = alturas[0];

		for (int i = 1; i < n; i++) {
			
			if (alturas[i] > maiorAltura) {
			
				maiorAltura = alturas[i];
			
			}
			if (alturas[i] < menorAltura) {
				
				menorAltura = alturas[i];
				
			}
		}

		for (int i = 0; i < n; i++) {
			
			if (generos[i] == 'M') {
				
				qntdH++;
				
			} 
			else {
				
				qntdM++;
				alturaTotal = alturaTotal + alturas[i];
				
			}
		}

		alturaMedia = alturaTotal / qntdM;

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("MÉdia das alturas das mulheres = %.2f\n", alturaMedia);
		System.out.printf("Número de homens = %d\n", qntdH);

		sc.close();

	}

}
