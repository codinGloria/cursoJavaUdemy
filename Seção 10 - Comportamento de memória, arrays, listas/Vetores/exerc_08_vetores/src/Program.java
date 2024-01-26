import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int soma=0, pares=0;
		double media = 0;
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Digite um número: ");
			vect[i]= sc.nextInt();	
			
		}
		
		for (int i=0; i<n; i++) {
			
	        if (vect[i] % 2 == 0) {
	        	
	            soma = soma + vect[i];
	            pares++;
	            
	        }
	    }

	    if (pares == 0) {
	    	
	    	System.out.println("NENHUM NÚMERO PAR");
	    	
	    }
	    else {
	    	
	        media = (double)soma / pares;

	        System.out.printf("MÉDIA DOS PARES = %.1f\n", media);
	    }
		
		sc.close();
	}

}