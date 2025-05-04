import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int codigo = sc.nextInt();
		
		while (codigo != 4) {
			
			if (codigo == 1) {
				
				alcool += 1;
				
			}
			else if (codigo == 2) {
				
				gasolina += 1;
				
			}
			else if (codigo == 3) {
				
				diesel += 1;
				
			}
			
			codigo = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
		}

	}