import java.util.*;
public class Year {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inYear = in.nextLine();
		in.close();
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
