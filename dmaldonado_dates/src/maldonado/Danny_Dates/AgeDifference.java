package maldonado.Danny_Dates;

import java.util.Scanner;

public class AgeDifference 
{
	int date1Day, date2Day;
	int years = 0, months = 0, days = 0;
	public void dateDiff()
	{
		System.out.println("Enter first date");
		Scanner scan = new Scanner(System.in);
		String date1 = scan.next();

		int date1Year = Integer.parseInt(date1.substring(date1.lastIndexOf("/")+1));
		int date1Month = Integer.parseInt(date1.substring(0,date1.indexOf("/")));
		date1Day = Integer.parseInt(date1.substring(date1.indexOf("/")+1,date1.lastIndexOf("/")));

		System.out.println("Enter second date");
		String date2 = scan.next();

		int date2Year = Integer.parseInt(date2.substring(date2.lastIndexOf("/")+1));
		int date2Month = Integer.parseInt(date2.substring(0,date2.indexOf("/")));
		date2Day = Integer.parseInt(date2.substring(date2.indexOf("/")+1,date2.lastIndexOf("/")));
		System.out.println("First date is: " +date1);
		System.out.println("Second date is: " +date2);

		years = date1Year - date2Year;
		if(date1Month > date2Month)
		{
			months = date1Month - date2Month;
			day();
		}
		else if(date1Month==date2Month)
		{
			day();
		}
		else
		{
			years = date1Year - (date2Year + 1);
			months = 11;
			day();
		}
		System.out.println("There is "+years +" year(s), " + months + " month(s), " + days + " day(s) between " + date1 + " and " + date2);
		scan.close();
	}
	
	public void day()
	{
		if(date1Day > date2Day)
		{
			days = date1Day - date2Day;				
		}
		else
		{
			days = date2Day - date1Day;
		}
	}
}