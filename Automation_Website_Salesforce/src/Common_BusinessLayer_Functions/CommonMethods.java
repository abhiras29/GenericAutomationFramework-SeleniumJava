package Common_BusinessLayer_Functions;

public class CommonMethods {

	/**
	 * This function is to swap two numbers
	 * Parameters : 
	 */
	public void swap(Object i, Object j)
	{
		Object temp = i;
		i=j;
		j=temp;
	}
	
	public void print(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
	

}
