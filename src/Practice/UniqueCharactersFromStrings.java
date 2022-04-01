package Practice;

public class UniqueCharactersFromStrings {
	public void uniqueChars(String str1, String str2) {
		String commonChars ="";
		String uniqueChars="";
		if (str1.length() > 0 & str2.length() > 0) {
			String toBeIterated = (str1.length() > str2.length() ? str1 : str2);
			String toBeChecked = toBeIterated.equals(str2) ? str1 : str2;
			System.out.println("String to be iterated: " + toBeIterated);
			System.out.println("String to be checked: " + toBeChecked);
			for (int i = 0; i < toBeIterated.length(); i++) {
				if (toBeChecked.contains(Character.toString(toBeIterated.charAt(i)))) {
					commonChars=commonChars+Character.toString(toBeIterated.charAt(i));
				}
				else
				{
					uniqueChars=uniqueChars+Character.toString(toBeIterated.charAt(i));
				}
			}
			System.out.println("Unique characters from the given Strings "+uniqueChars);
		}
	}
 
	public static void main(String[] args) {
		UniqueCharactersFromStrings obj=new UniqueCharactersFromStrings();
		 String s1="adbecf";
		 String s2="abc";
		 obj.uniqueChars(s1, s2);
	}
}
