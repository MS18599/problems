import java.io.*;
import java.util.*;

class First_Occurence
{
	public static void main(String arg[])
	{
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = sc.next();
		char c[] = word.toCharArray();
		Map<Character,Integer> obj = new LinkedHashMap<>();
		for(Character ch : c)
		{
			if(obj.containsKey(ch))
				obj.put(ch,obj.get(ch)+1);
			else
				obj.put(ch,1);
		}
		//char first = obj.keySet().stream().findFirst().get();
		//System.out.println(first);
		 Map.Entry<Character,Integer> entry = obj.entrySet().iterator().next();
		 char key = entry.getKey();
		 
		 System.out.println("First non repeated element.......");
		 System.out.println(key);
		
		
	}
}