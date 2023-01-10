import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int in= 0;
		int out=0;
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			
			if (x <= 20 && x >= 10) {
				
				in++;
				
			}
			else {
				
				out++;
				
			}
			
		}
		
		System.out.printf("%d in%n", in);
		System.out.printf("%d out", out);
		
		sc.close();
				
	}

}
