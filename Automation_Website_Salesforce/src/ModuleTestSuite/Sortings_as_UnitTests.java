package ModuleTestSuite;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Common_BusinessLayer_Functions.CommonMethods;

/**
 * @author abhishekr
 *
 */
/**
 * @author abhishekr
 *
 */
public class Sortings_as_UnitTests {
	
	static int []array={2,4,12,45,1,8,3,65,23,9};
	CommonMethods cmds = new CommonMethods();
	
	
	@Before
	public void initial_setup()
	{
		//This method is to set some common steps
	}

	/**
	 * This test method is used to perform
	 * Bubble Sorting on the input integer Array
	 */
	@Test
	public void BubbleSort()
	{
		for (int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				//This if statement will compare the two integers
				if(array[i]<array[j])
				{
					int temp = array[i];
					array[i]=array[j];	
					array[j]=temp;
				}
			}
		}
		cmds.print(array);
	}
	
	/**
	 * 
	 */
	@Test
	public void MergeSort()
	{
		
	}
	
	/**
	 * 
	 */
	@Test
	public void InsertionSort()
	{
		
	}
	
	/**
	 * 
	 */
	@Test
	public void SelectionSort()
	{
		
	}
	
	/**
	 * 
	 */
	@Test
	public void BucketSort()
	{
		
	}
	
}
