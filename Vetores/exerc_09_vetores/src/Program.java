import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		int maisVelho, posicao =0;;
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("Dados da %da pessoa:\n", i +1);
			System.out.println("Nome: ");
			nomes[i]= sc.next();
			System.out.println("Idade: ");
			idades[i]= sc.nextInt();
			
		}
		
		maisVelho = idades[0];
		
		for(int i=1; i<n; i++) {
			
			if (idades[i] > maisVelho) {
				
	            maisVelho = idades[i];
	            posicao = i;
	        }
			
	    }
		
	    System.out.println("PESSOA MAIS VELHA = " + nomes[posicao]);		
		
		sc.close();
	}

}
