package maldonado.Danny_Dates;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Aniversary 
{
	String aniversary;
	GregorianCalendar greg;
	int aniDay, aniYear, aniMonth, month, year, day, currentDay, hr, min, sec;
	public void aniversaryDate()
	{
		greg = new GregorianCalendar();
		System.out.println("Enter aniversary date");
		Scanner scan = new Scanner(System.in);
		aniversary = scan.next();
		aniYear = Integer.parseInt(aniversary.substring(aniversary.lastIndexOf("/")+1));
		aniMonth = Integer.parseInt(aniversary.substring(0,aniversary.indexOf("/")));
		aniDay = Integer.parseInt(aniversary.substring(aniversary.indexOf("/")+1,aniversary.lastIndexOf("/")));
		aniYear = aniYear + 1;
		scan.close();
		subtraction();
	}
	
	public void subtraction()
	{
		currentDay = greg.get(Calendar.DAY_OF_MONTH);
		int currentMonth = greg.get(Calendar.MONTH) + 1;
		int currentYear = greg.get(Calendar.YEAR);
		int currentHour = greg.get(Calendar.HOUR);
		int currentMin = greg.get(Calendar.MINUTE);
		int currentSec = greg.get(Calendar.SECOND);
		System.out.println(currentDay);
		System.out.println(currentMonth);
		System.out.println(greg.getTime());
		//aniversary - now
		if(currentMonth>aniMonth)
		{
			month = currentMonth- aniMonth;
			day();
		}
		else if(currentMonth==aniMonth)
		{
			day();
		}
		else
		{
			month = 11;
			day();
		}
		day = day - 1;
		hr = 24 - currentHour;
		hr = hr -1;
		min = 60 - currentMin;
		min = min - 1;
		sec = 60 - currentSec;
		printDate();
	}
	
	public void day()
	{
		if(currentDay > aniDay)
		{
			day = currentDay - aniDay;				
		}
		else
		{
			day = aniDay - currentDay;
		}
	}
	
	public void printDate()
	{
		System.out.println(month + " month(s) " + day + " day(s) " + hr + " hour(s) "+ min + " minute(s) " + sec + " second(s) to your aniversary");
	}
}