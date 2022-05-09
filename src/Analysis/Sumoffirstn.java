package Analysis;

public class Sumoffirstn {

	public int SumOfFirstNNumbers(int n)
	{
		int sum = 0;
		
		for(int i = n; i >=0; i--)
		{
			sum = sum + i;
		}
		return sum;
	}
	
	public int SumOfFirstNNumbersWithFormulae(int n)
	{
		return (n * (n+1))/2;
	}
	
	public boolean IsPrimeNumber(int n)
	{
		if(n == 1 || n == 2)
		{
			return true;
		}
		
		for(int i = 2; i <=n/2; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
