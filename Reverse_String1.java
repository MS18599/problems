import java.util.*;
class Reverse_String1
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println("Enter String:");
		String s=sc.next();
		sb.append(s);
		System.out.println(sb.reverse());
	}
}