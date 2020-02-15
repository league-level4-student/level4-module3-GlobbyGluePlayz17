package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divide(double d1, double d2) throws Exception {
		double quotient = d1/d2;
		
		if (d2 == 0.0) {
			throw new IllegalArgumentException();
		}
		
		System.out.println(quotient);
		return quotient;
	}
	
	public static String reverseString(String s) {
		String newS = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			newS = newS + s.charAt(i);
		}
		
		if (s == "") {
			throw new IllegalStateException();
		}
		
		System.out.println(newS);
		return newS;
		
	}
}
