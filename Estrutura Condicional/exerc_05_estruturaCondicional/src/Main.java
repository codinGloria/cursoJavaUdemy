import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qnt = sc.nextInt();
		
		double preco;
		
		if (codigo == 1) {
			
			preco = qnt * 4.0;
			
		}
		else if (codigo == 2){
			
			preco = qnt * 4.5;
			
		}
		else if (codigo == 3){
			
			preco = qnt * 5.0;
			
		}
		else if (codigo == 4){
			
			preco = qnt * 2.0;
			
		}
		else {
			
			preco = qnt * 1.5;
			
		}

		System.out.printf("Total: R$ %.2f%n", preco);
		
		sc.close();

	}

}
