import java.util.*;
class Check_Number
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String s = sc.next();
		if(s.matches("[0-9]+"))
		   System.out.println("contain only digit....");
	    else
			System.out.println("contain character as well.....");
	}
}