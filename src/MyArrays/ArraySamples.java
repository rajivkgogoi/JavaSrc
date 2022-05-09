package MyArrays;

public class ArraySamples {

	public int[] DeleteElement(int[] arr, int n, int x)
	{	
		int indxToDelete = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(x == arr[i])
			{
				indxToDelete = i;
				break;
			}
		}
		for(int i = indxToDelete; i < n-1; i++)
		{
  			arr[i] = arr[i + 1];
		}
		
		return arr;
	}
	
	public int LargestElement(int[] arr)
	{
		int largest;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i])
		}
	}
}
