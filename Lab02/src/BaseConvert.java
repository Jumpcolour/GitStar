/**
 * 
 * Write a program that converts a base 10 number to a 4-digit number in another base
 * 
 * Converts base 10 numbers to another base
 * (at most 4 digits in the other base).
 * The base 10 number and the base are input
 * 
 * @author Steve Lo
 *
 */
import java.util.Scanner;

public class BaseConvert 
{
	public static void main (String[] args)
	{
		int base;		//The new base
		int base10Num;	//The number in base 10
		int maxNumber;	//The maximum number that will fit in 4 digits in the new base
		
		int place0;		//Digit in the 1's (base^0) place
		int place1;		//Digit in the base^1 place
		int place2;		//Digit in the base^2 place
		int place3;		//Digit in the base^3 place
		
		int quotient0;
		int quotient1;
		int quotient2;
		int quotient3;
		
		String baseBnum = new String ("");	//The number in the new base
		Scanner scan = new Scanner(System.in);
		
		//read in the base 10 number and the base
		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.println();
		System.out.println("Please enter a base (2-9): ");
		base = scan.nextInt();
		
		maxNumber = (base*base*base*base - 1);
		System.out.println("The maximum number you can input is " + maxNumber);
		
		//Compute the maximum base 10 number that will fit in 4 digits
		//in the new base and tell the user what range the number they
		//want to convert must be in
		
		System.out.print(("Please enter a base 10 number to convert: "));
		base10Num = scan.nextInt();
		
		place0 = (base10Num % base);
		quotient0 = (base10Num / base);
		place1 = (quotient0 % base);
		quotient1 = (quotient0 / base);
		place2 = (quotient1 % base);
		quotient2 = (quotient1 / base);
		place3 = (quotient2 % base);
		quotient3 = (quotient2 / base);
		
		baseBnum = ("" + place3 + place2 + place1 + place0);
		System.out.println(baseBnum);
		
		scan.close();
	}
	
	
}
