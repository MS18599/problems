import java.util.*;
class Count_vowel
{
	public static void main(String arg[])
	{
		int vowel=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String s = sc.nextLine();
		System.out.println(s.length());
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)== 'a'||s.charAt(i)== 'e'||s.charAt(i)== 'i'||s.charAt(i)== 'o'||s.charAt(i)== 'u')
				vowel+=1;
		
		}
		System.out.println("VOWEL = "+vowel);
		System.out.println("CONSONANT = "+(s.length()-vowel));
		
	}
}