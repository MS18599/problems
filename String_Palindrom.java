import java.util.*;
class String_Palindrom
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
			String str = sc.next();
		StringBuffer br = new StringBuffer(str);
		String str1 = br.reverse().toString();
		if(str1.equals(str))
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
	}
}