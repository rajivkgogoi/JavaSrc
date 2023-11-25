package Sorting;

public class BubbleSort {

	public void Sort(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = arr.length - 1; j > i; j--)
			{
				if(arr[j-1] > arr[j])
				{
					//Swap arr[j] with arr[j-1]
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// Print sorted elements
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
