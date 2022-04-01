package Practice;

public class RemoveSpecialCharactersfromString {
	public void fetchOnlyStringandInt(String str)
	{
		String str2;
		System.out.println("Given String "+str);
		str2=str.replaceAll("[^a-zA-Z0-9]","");
	    System.out.println("String after removing special characters "+str2);
	}
	public static void main(String[] args) {
		RemoveSpecialCharactersfromString obj=new RemoveSpecialCharactersfromString();
	    String str="T!esti!ng@123#";
	    obj.fetchOnlyStringandInt(str);
		}
}

