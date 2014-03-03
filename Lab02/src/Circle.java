/**
 *
 * Circle.java
 * 
 * Prints the area of a circle with two different radii
 * 
 * @author Steve Lo
 *
 */
import java.util.Scanner;
public class Circle 
{
	public static void main(String []args)
	{
		Scanner scan= new Scanner(System.in);
		final double PI = 3.14159;
		
		int radius1 = 10;
		double area1 = PI * radius1 * radius1;
		double circumference1 = 2 * PI * area1;
		
		System.out.println("Please enter a value for the radius");
		radius1=scan.nextInt();
		
		//Area and circumference of the first circle
		System.out.println("The area of a circle with radius " + radius1 + 
						   " is " + area1);
		
		System.out.println("The circumference of a circle with radius " + radius1 +
				   " is " + circumference1);
		
		int radius2 = 20;
		double area2 = PI * radius2 * radius2;
		double circumference2 = 2 * PI * area2;
		
		//Area and circumference of the second circle
		System.out.println("The area of a circle with radius " + radius2 +
						   " is " + area2);
		
		System.out.println("The circumference of a circle with radius " + radius2 +
						   " is " + circumference2);
		
		//Printing out the information of both circles after declaring them as variables
		System.out.println("The area of the first circle is " + area1 + 
				" and the circumference is " + circumference1);
		
		System.out.println("The area of the second circle is " + area2 + 
				" and the circumference is " + circumference2);
		
		double changeArea = area2 / area1;
		double changeCircum = circumference2 / circumference1;
		
		//Calculating the change in radius and circumference
		System.out.println("The change in radius is " + changeArea);
		System.out.println("The change in circumference is " + changeCircum);
		
		scan.close();
	}
	
}
