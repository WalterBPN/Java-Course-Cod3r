package fundamentos;

public class ConvertionByCast {
	
	public static void main(String[]Args) {
		
		//If it is a conversion of a primitive, you must do like the following example:
		int i = 7;		
		String s1 = Integer.toString(i);
		System.out.println(s1);
		
		
		//If it is a conversion of an Object, you can do like the following example:
		Integer i2 = 10;
		String s2 = i2.toString();
		System.out.println(s2);
		
		//You can convert a number into a String concatenating an empty String with the number and it will become a String
		int i3 = 3;
		String s3 = "" + i3;
		System.out.println(s3);
	}

}
