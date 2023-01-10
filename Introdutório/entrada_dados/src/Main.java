import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a;
		a = sc.next();
		System.out.println("Voce digitou: " + a);
		
		int b;
		b = sc.nextInt();
		System.out.println("Voce digitou: " + b);
		
		double c;
		c = sc.nextDouble();
		System.out.println("Voce digitou: " + c);
		
		char d;
		d = sc.next().charAt(0);
		System.out.println("Voce digitou: " + d);
		
		sc.close();
		
	}

}
