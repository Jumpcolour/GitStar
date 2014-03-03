/**
 * 
 * Names.java
 * Prints a list of student names with their grades earned
 * (lab points, bonus points, and total)
 * @author Steve Lo
 *
 */
public class Names 
{
	
	public static void main (String[] args) 
	{
		
		int markOne = 63;
		int markTwo = 45;
		int markThree = 70;
		int markFour = 49;
		int markFive = 60;
	
		int bonusOne = 7;
		int bonusTwo = 9;
		int bonusThree = 5;
		int bonusFour = 9;
		int bonusFive = 4;
	
		String studentOne = "Jill";
		String studentTwo = "Kerry";
		String studentThree = "Frank";
		String studentFour = "Danielle";
		String studentFive = "Ernie";
	
		System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==          Student Points          ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
		System.out.println("");
		System.out.println("Name	    Lab	Bonus	Total");
		System.out.println("----	    ---	-----	-----");
		System.out.println(studentOne + "	    " + markOne + "	" + bonusOne + "	" + (markOne+bonusOne));
		System.out.println(studentTwo + "	    " + markTwo + "	" + bonusTwo + "	" + (markTwo+bonusTwo));
		System.out.println(studentThree + "	    " + markThree + "	" + bonusThree + "	" + (markThree+bonusThree));
		System.out.println(studentFour + "    " + markFour + "	" + bonusFour + "	" + (markFour+bonusFour));
		System.out.println(studentFive + "	    " + markFive + "	" + bonusFive + "	" + (markFive+bonusFive));
	}
}
