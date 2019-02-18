package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Alteration for GitHub test");
		System.out.print("How many employees will be registered? ");
		int quantity = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();		
		
		for (int i = 0; i < quantity; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);			
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
				
		System.out.println();
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				
		if (employee!=null) {
						
			System.out.print("Enter percentage: ");
			int percentage = sc.nextInt();
			employee.increaseSalary(percentage);
		}
		else
			System.out.println("This id does not exist!");
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee printEmployee : list) {
			 System.out.println(printEmployee);
		}
				
		sc.close();

	}

}
