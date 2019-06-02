import java.util.*;
class Permutation_String{
	void permutation(String s , int i , int n)
	{
		if(i == n)
			System.out.println(s);
	    else
		{
			for(int j=i; j<=n; j++)
			{
				s = swap(s,i,j);
				permutation(s,i+1,n);
				s=swap(s,i,j);
			}
		}
	}
	String swap(String a, int i, int j)
	{
		char temp;
		char ch[] = a.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
	public static void main(String arg[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.next();
		System.out.println("----------------------------------------------------");
		int n = s.length();
		Permutation_String obj = new Permutation_String();
		obj.permutation(s,0,n-1);
	}
}