import java.util.Scanner ;
import java.math.BigInteger;
//import java.lang.Math;

public class MainClass {
	
	public static void main(String[] args) {
		
       Scanner input = new Scanner (System.in);
       int inputValue = input.nextInt() ; 
       
       System.out.println("Valoarea citita de la tastatura este " + inputValue);
       
		int maxInt = Integer.MAX_VALUE;
		System.out.println(maxInt + 1);
		
		int minInt = Integer.MIN_VALUE;
		System.out.println(minInt - 1);
		
		double maxFloat = Double.MAX_VALUE;
		System.out.println(maxFloat * 3);
		
		
		try { 
			
			System.out.println(maxInt / inputValue);
		}
		catch(ArithmeticException exception) {
			System.out.println("Hey ai introdus o valaore gresita, introdu o alta valoare!");
			inputValue = input.nextInt() ;
		}
		
		System.out.println("Noua valaore este " + inputValue);
		
		BigInteger o = new BigInteger("1");
		int putere = 64;
		BigInteger j = new BigInteger("2");
		for(int i = 0; i < putere; i++)
		{
            o = o.multiply(j);
		} 
		System.out.println((o.add(BigInteger.ONE.negate())));
		
		
		String str1 = "Ana are ";
		String str2 = "mere";
		String str3 = str1 + str2;
		System.out.println(str3.equals("Ana are mere"));
		
		
	}
}
