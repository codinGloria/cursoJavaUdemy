import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int qntd = 0;
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Digite um número: ");
			vect[i]= sc.nextInt();
			
		}
		
		System.out.println("NÚMEROS PARES:\n");
		
		for (int i=0; i<vect.length;i++) {
			
			if(vect[i]%2==0) {
				
				System.out.printf("%d ", vect[i]);
				qntd++;
			}
			
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qntd);										
		
		sc.close();
	}

}
