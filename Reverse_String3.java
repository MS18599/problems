import java.util.*;
class Reverse_String3
{
	public String str(String s)
	{
		if(s.isEmpty())
			return s;
		else 
			return str(s.substring(1))+s.charAt(0);
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String s=sc.next();
		Reverse_String3 obj = new Reverse_String3();
		System.out.println(obj.str(s));
		
		
	}
}