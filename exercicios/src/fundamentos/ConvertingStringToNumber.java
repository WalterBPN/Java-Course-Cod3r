package fundamentos;

public class ConvertingStringToNumber {
	
	public static void main(String[] args) {
		
		String s1 = "1.5";
		String s2 = "8.5";
		
		System.out.println(s1+s2);
		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		System.out.println(d1 + d2);
		
		
		
	}

}
