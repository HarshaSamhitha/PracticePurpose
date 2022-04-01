package Practice;

public class Factorial {
	public void findFactorial(int numb)
	{
		int fact=1;
		for(int i=numb;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of given number "+numb+" is "+fact);
	}

	public static void main(String[] args) {
		Factorial obj=new Factorial();
	    int num=5;
	    obj.findFactorial(num);
	}

}
