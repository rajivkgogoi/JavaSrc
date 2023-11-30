package Sorting;

public class InsertionSort {

	public void Sort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i <= n - 1; i++)
		{
			int red = i - 1;
			int temp = arr[i];
			
			while((red >= 0) && (arr[red] > temp))
			{
				arr[red+1] = arr[red];
				red--;
			}
			arr[red+1] = temp;
		}
		
		System.out.println("Printing sorted elements -");
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
