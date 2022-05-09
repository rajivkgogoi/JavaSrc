package DSAndAlgo.Main;

import Analysis.Sumoffirstn;
import MyArrays.ArraySamples;
import Recursion.MyRecursion;

public class DSAndAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Data Structures & Algorithms!");
		
		ArraySamples as = new ArraySamples();
		int[] arr = {3,8,12,5,6};
		int[] newarr = as.DeleteElement(arr, 5, 6);
		
		for(int i = 0; i < newarr.length; i++)
		{
			System.out.println(newarr[i]);
		}
	}
}
