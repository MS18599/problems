import java.io.*;
import java.util.*;

class Duplicate_String
{
	public static void main(String arg[])
	{
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = sc.next();
		char c[] = word.toCharArray();
		Map<Character,Integer> obj = new HashMap<>();
		for(Character ch : c)
		{
			if(obj.containsKey(ch))
				obj.put(ch,obj.get(ch)+1);
			else
				obj.put(ch,1);
		}
		Set<Map.Entry<Character,Integer>> val = obj.entrySet();
		for(Map.Entry<Character,Integer> e:val){
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		
					
		
		
	}
}