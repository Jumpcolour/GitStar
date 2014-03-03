/**
 * 
 * Ideal Weight
 * Write a program to compute the ideal weight
 * for both male and female
 * 
 * @author Steve Lo
 *
 */
import java.util.Scanner;
public class idealWeight 
{
	public static void main (String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int heightFeet, heightInch, heightFeetIn, heightTotal;
		double fweight, fweightDown, fweightUp, mweight, mweightDown, mweightUp;
		
		System.out.println("Input your height in feet");
		heightFeet=scan.nextInt();
		System.out.println("Input your height in inches");
		heightInch=scan.nextInt();

		heightFeetIn = (heightFeet * 12);
		heightTotal = (heightInch + heightFeetIn);
		
		fweight = 100 + ((heightTotal - 60)*5);
		fweightDown = (fweight - (fweight * 0.15));
		fweightUp = (fweight + (fweight * 0.15));
		
		System.out.println("Your ideal female weight is " + fweight + (" pounds"));
		System.out.println("But you should be fine if you are within "
				+ fweightDown + " and " + fweightUp);
		
		mweight = 100 + ((heightTotal - 60)*6);
		mweightDown = (mweight - (mweight * 0.15));
		mweightUp = (mweight + (mweight * 0.15));
		
		System.out.println("Your ideal male weight is " + mweight + (" pounds"));
		System.out.println("But you should be fine if you are within "
				+ mweightDown + " and " + mweightUp);
		
		scan.close();
	}
	
}
