import java.util.*;
class Count_Char
{
	public static void main(String arg[])
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		System.out.println("Enter Character : ");
		char ch = sc.next().charAt(0);
		
		for(int i=0; i<s.length(); i++)
		{
			if(ch == s.charAt(i))
				count+=1;
			
		}
		System.out.println(count);
	}
}
		