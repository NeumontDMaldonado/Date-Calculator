package maldonado.Danny_Dates;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args)
	{
		System.out.println("What function would you like to do?\n1) Age Calculater\n2) Anniversary Calculator\n3) Age Difference Calculator");
		System.out.println("Note, the input must be the number only");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num == 1)
		{
			System.out.println("Enter your birthday in mm/dd/yyyy format");
			AgeCalculator calc = new AgeCalculator();
		}
		else if(num == 2)
		{
			Aniversary ani = new Aniversary();
			ani.aniversaryDate();
		}
		else if(num == 3)
		{
			System.out.println("Note, the first date must be closer to current date than the second date");
			AgeDifference diff = new AgeDifference();
			diff.dateDiff();
		}
		scan.close();
	}
}