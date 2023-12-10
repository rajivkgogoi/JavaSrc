package Sorting;

import java.util.ArrayList;

public class MergeSort {

	public int[] Sort(int[] arr)
	{
		MergeSortHelper(arr, 0, arr.length-1);
		return arr;
	}
	
	public void MergeSortHelper(int[] arr, int start, int end)
	{
		// Leaf node condition
		// Leaf nodes have a single element sub-array only. So they can
		// just return
		if(start == end)
		{
			return;
		}
		// Intermediate node condition
		int mid = (start + end)/2;
		MergeSortHelper(arr, start, mid);
		MergeSortHelper(arr, mid+1, end);
		
		merge(arr, start, mid, end);
	}

	private void merge(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int i = start; int j = mid+1;
		ArrayList<Integer> aux = new ArrayList<>();
		while(i <= mid && j <= end)
		{
			if(arr[i] <= arr[j])
			{
				aux.add(arr[i]);
				i++;
			}
			else //if(arr[j] <= arr[i])
			{
				aux.add(arr[j]);
				j++;
			}
		}
		// Copy remaining elements from one of the sub-arrays on left or right
		while(i <= mid)
		{
			aux.add((arr[i]));
			i++;
		}
		while(j <= end)
		{
			aux.add(arr[j]);
			j++;
		}
		 for(int k = start; k<=end; k++){  /// GOTCHA....Array A is subset so i = start and not 0
	            //arr.set(i, aux.get(i-start )); //<< GOTCHA i-start since AUX starts at 0
	            arr[k] = aux.get(k-start);
		 }
	       
		//return aux.stream().mapToInt(Integer::intValue).toArray();
	}
}
