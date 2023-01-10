package application;

import java.util.Locale;
import java.util.Scanner; 
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x = new Employee();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + x);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + x);
		
		sc.close();
	}

}
