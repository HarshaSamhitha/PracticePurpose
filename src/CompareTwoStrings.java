package Practice;

import java.util.LinkedHashSet;

public class CompareTwoStrings {
	public void uniqueChars(String str1, String str2) {
		 
		if (str1.length() > 0 & str2.length() > 0) {
			LinkedHashSet<Character> s1 = new LinkedHashSet<>();
			LinkedHashSet<Character> s2 = new LinkedHashSet<>();
 
			for (int i = 0; i < str1.length(); i++) {
				s1.add(str1.charAt(i));
			}
			for (int i = 0; i < str2.length(); i++) {
				s2.add(str2.charAt(i));
			}
			s1.removeAll(s2);
			System.out.println(s1);
         }
		} 

	public static void main(String[] args) {
		CompareTwoStrings obj=new CompareTwoStrings();
    String s1="This is String One";
    String s2="This is String Two";
    obj.uniqueChars(s1, s2);

	}

}
