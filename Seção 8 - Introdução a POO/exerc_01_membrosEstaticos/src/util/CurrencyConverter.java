package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static double Converter(double valor, double dolar) {
		
		return valor * dolar * (1.0 + 0.06);
		
	}

}