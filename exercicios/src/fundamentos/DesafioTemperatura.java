package fundamentos;

public class DesafioTemperatura {
	
	public static void main(String[] Args) {
		
		//Converting Fahrenheit to Celsius;		(32 °F − 32) × 5/9 = 0 °C

		
		double fahrenheit = 86;
		final double fahToCelsius = (fahrenheit - 32) * (5.0/9.0);
		
		System.out.println(fahrenheit + " graus Fahrenheit é equivalente a " + fahToCelsius + " graus Celsius.");
		
		
		
		//Converting Celsius to Fahrenheit;		(0 °C × 9/5) + 32 = 32 °F

		double celsius = 32.0;
		final double celsiusToFah = ((celsius * (9.0 / 5.0)) + 32);
		System.out.println(celsius + " graus Celsius é equivalente a " + celsiusToFah + " graus Fahrenheit.");
		
	}

}
