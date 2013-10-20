package maldonado.Danny_Dates;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator 
{
	int currentDay, bDay, day = 0;
	public AgeCalculator()
	{
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		String birthday = scan.next();
		
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		bDay = Integer.parseInt(birthday.substring(birthday.indexOf("/")+1,birthday.lastIndexOf("/")));
		int year = 0, month = 0;
		int currentYear = cal.get(Calendar.YEAR);
		int currentMonth = cal.get(Calendar.MONTH);
		currentMonth = currentMonth+1;
		int bYear = Integer.parseInt(birthday.substring(birthday.lastIndexOf("/")+1));
		int bMonth = Integer.parseInt(birthday.substring(0,birthday.indexOf("/")));
		
		year = currentYear - bYear;
		if(currentMonth>bMonth)
		{
			month = currentMonth- bMonth;
			day();
		}
		else if(currentMonth==bMonth)
		{
			day();
		}
		else
		{
			System.out.println(currentMonth);
			System.out.println(bMonth);
			year = currentYear - (bYear + 1);
			month = 11;
			day();
		}
		System.out.println(year+" years "+month +" months " + day + " days old");
		scan.close();
	}
	
	public void day()
	{
		if(currentDay > bDay)
		{
			day = currentDay - bDay;				
		}
		else
		{
			day = bDay - currentDay;
		}
	}
}