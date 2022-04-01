package Practice;

public class PrintingPairOfElementsWithSum5 {
	int sum1=5,sum2;
	public void sumofPairs(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			 sum2=arr[i]+arr[j];	
			if(sum2==sum1)
			{
				System.out.println("Elements with sum equlas to 5:"+arr[i]+"and"+arr[j]);
			}
			}
		}
	}

	public static void main(String[] args) {
		PrintingPairOfElementsWithSum5 obj=new PrintingPairOfElementsWithSum5();
		int[] arr= {1,3,6,5,2,4,8,2};
		obj.sumofPairs(arr);
	}

}
