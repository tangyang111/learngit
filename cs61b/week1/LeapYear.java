class LeapYear
{
	public static void main(String[] args){
	
		int year = 2000;
		boolean a = false;
		boolean b = false;
		if (year % 400 == 0)
		{
			a = true;
		}
		if ((year % 4 == 0) && (year % 100 != 0))
		{
			b = true;
		}
		if (a || b)
		{
			System.out.println(year + " is a leap year.");
		}
		else{
			System.out.println (year + " is not a leap year.");
		}


	}
}