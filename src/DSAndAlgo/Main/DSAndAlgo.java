package DSAndAlgo.Main;

import Analysis.Sumoffirstn;
import MyArrays.ArraySamples;
import Recursion.MyRecursion;
import Sorting.*;

public class DSAndAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Data Structures & Algorithms testing!");
		
		//ArraySamples as = new ArraySamples();
		int[] arr = {4,5,3,1,7,9};
		MergeSort sorting = new MergeSort();
		int[] arrNew = sorting.Sort(arr);
		
		for(int i = 0; i < arrNew.length; i++)
		{
			System.out.println(arrNew[i]);
		}
	}
}
