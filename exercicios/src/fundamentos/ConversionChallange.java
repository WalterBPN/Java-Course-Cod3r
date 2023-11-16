package fundamentos;

import java.util.Scanner;

public class ConversionChallange {
	
	public static void main (String[]Args) {
		
		/*
		 * The program must receive the last three salaries and calculate the average.
		 * The user must have the option of type the value with , or .
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Type your first salary: ");
		double salary1 = Double.parseDouble(input.nextLine().replace(",", "."));
		//System.out.println(salary1);
		
		System.out.print("\nType your secound salary: ");
		double salary2 = Double.parseDouble(input.nextLine().replace(",", "."));
		//System.out.println(salary2);
		
		System.out.print("\nType your third salary: ");
		double salary3 = Double.parseDouble(input.nextLine().replace(",", "."));		
		//System.out.println(salary3);		
		input.close();
		
		double average = (salary1 + salary2 + salary3) / 3;
		System.out.printf("%.2f" , average);
		
	}

}
