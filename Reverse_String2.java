import java.util.*;
class Reverse_String2
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String s=sc.next();
		char ch[]=s.toCharArray();
		//System.out.println(Arrays.toString(ch));
		  for(int i=ch.length-1; i>=0; i--)
				System.out.print(ch[i]);
			    
	}
}