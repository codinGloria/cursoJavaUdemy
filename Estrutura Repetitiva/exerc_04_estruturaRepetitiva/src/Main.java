import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();	
			
			if (valor2 != 0) {
				
				double divisao = (double) valor1 / valor2;
				System.out.printf("%.1f%n", divisao);
			
			}
			else {
				
				System.out.println("Divisao impossivel");
				
			}
			
			
		}
		
		sc.close();				

	}

}
