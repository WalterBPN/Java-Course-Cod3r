package fundamentos;

import java.util.Scanner;

public class ScannerIn {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		
		System.out.println("Comparing Strings using ==");
		System.out.println("2" == s1);
		
		
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
				
		System.out.println("Comparing Strings using ==");
		System.out.println("2" == s2.trim());
		
		System.out.println("Comparing using equals");
		System.out.println("2".equals(s2));	
		
		entrada.close();			
		
		
	}

}
