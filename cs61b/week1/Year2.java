import java.util.*;
public class Year2 {

	public static void main(String[] args) {
		String inYear = args[0];
		int year = Integer.parseInt(inYear);
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
