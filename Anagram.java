import java.io.*;
import java.util.*;
class Anagram
{
	public static void main(String arg[])
	{
		int i=0,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First string : ");
		String s1 = sc.next();
		System.out.println("Enter Second string : ");
		String s2 = sc.next();
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1!=len2)
			System.out.println("Not Anagram...... :(");
		else
		{
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		//System.out.println(Arrays.toString(c1));
		//System.out.println(Arrays.toString(c2));
		String str1 = String.valueOf(c1);
			System.out.println(str1);
		String str2 = String.valueOf(c2);
			System.out.println(str2);
		
			for(int j=0; j<len1; j++){
				if(str1.charAt(i)==str2.charAt(j))
				{
					i++;
					flag+=1;
					//continue;
				}
			}
			if(flag==len1)
				System.out.println("Anagram........ :) ");
	}
}
}