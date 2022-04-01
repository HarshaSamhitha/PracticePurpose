package Practice;

public class FindingVowelsInString {
	public void findingVowels(String istr)
	{
		String str=istr.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|str.charAt(i)=='e'|str.charAt(i)=='i'|str.charAt(i)=='o'|str.charAt(i)=='u')
			{
				// Instead of checking whole string finding first occurance to check vowels are present in given string or not
				System.out.println("Given string contains the first occurance of vowel " + str.charAt(i)+" at the index " + i);
				return;
			}
		}
	}

	public static void main(String[] args) {
		FindingVowelsInString obj=new FindingVowelsInString();
	    String inputstr="This is to test STRING containing VOWELS";
	    obj.findingVowels(inputstr);
	}

}
