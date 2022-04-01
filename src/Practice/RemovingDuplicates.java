package Practice;

import java.util.LinkedHashSet;

public class RemovingDuplicates {
	public static void removeDuplicates(String str)   
    {      
        LinkedHashSet<Character> set = new LinkedHashSet<>();  //using set as it will not allow duplicates   
        for(int i=0;i<str.length();i++)   
        set.add(str.charAt(i));   
        for(Character ch : set)   
        System.out.print(ch);   
    }  
	public static void main(String[] args) {
	    String str="Ttesstting dddupliiiccaate";
        removeDuplicates(str);   
	}

}
