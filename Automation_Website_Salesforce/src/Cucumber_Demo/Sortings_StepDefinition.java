package Cucumber_Demo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sortings_StepDefinition {

	int array[] = {2,4,12,45,1,8,3,65,23,9};
	
	@Given("^An Array of n$ integer")
	public void An_Array_of_N_integer()
	{
		
	}
	
	@When("^Bubble Sorting is applied")
	public void BubbleSort()
	{
		int temp;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
	}
	
	@When("^Merge Sorting is applied")
	public void MergeSort()
	{
		
	}
	
	@Then("^Array will be sorted in ascending order")
	public void printSortedArray()
	{
		
	}
	
}
