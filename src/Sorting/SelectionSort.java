package Sorting;

public class SelectionSort {
	
	public void Sort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int minValue = arr[i];
			int minIndex = i;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] < minValue)
				{
					minValue = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println("SortedArray");
		for(int i: arr)
		{
			System.out.println(i);
		}
	}
}
