package Recursion;

public class MyRecursion {

	public void PrintNto1(int n)
	{
		if(n == 0)
			return;
		
		System.out.print(n);
		System.out.print(' ');
		PrintNto1(n - 1);
	}
	
	public void Print1ToN(int n)
	{
		if(n == 0)
			return;
		
		Print1ToN(n - 1);
		System.out.print(n);
		System.out.print(' ');
	}
	
	public int Factorial(int n)
	{
		if(n == 0 || n == 1)
		{
			return 1;
		}
		
		return n * Factorial(n-1);
	}
	
	public int FactorialUsingTailRecursion(int n, int k)
	{
		if(n == 0 || n == 1)
		{
			return k;
		}
		
		return FactorialUsingTailRecursion(n - 1, n * k);
	}
	
	public int Fibonacci(int n)
	{
		if(n == 0 || n == 1)
			return n;
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
	
	public int SumOfNaturalNumbers(int n)
	{
		if(n == 1 || n == 0)
			return n;
		
		return n + SumOfNaturalNumbers(n-1);
	}
	
	public boolean CheckIfPalindrome(String str, int start, int end)
	{
		if(start >= end)
			return true;
		
		boolean b1 = str.charAt(start) == str.charAt(end);
		return b1 && CheckIfPalindrome(str, start + 1, end - 1);
	}
}
