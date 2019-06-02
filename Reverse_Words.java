import java.util.*;
class Reverse_Words
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		int n = s.length;
		String ans ="";
		for(int i=n-1; i>=0; i--)
		{
			ans+=s[i]+" ";
		}
		System.out.println(ans);
	}
}
		