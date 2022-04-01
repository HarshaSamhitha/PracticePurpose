package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterCount {
	public void countOfEachOccurence(String str)
	{
		char[] input =str.toCharArray();
		Map<Character,Integer> charmap=new HashMap<Character,Integer>();
		for(char c:input)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c,charmap.get(c)+1);
			}
			else
			{
				charmap.put(c,1);
			}
		}
		System.out.println("Each Character count of given String "+str+charmap);
	}
	

	public static void main(String[] args) {
    OccurenceOfCharacterCount obj=new OccurenceOfCharacterCount();
    String str="Testing each character count";
    obj.countOfEachOccurence(str);
	}

}
