package whileLoop.second;

public class PositiveNegativeOddEven {
void printEvenodd(int n)
{
	int i=1;
	while(i<=n)
	{
		if(i%2==0)
		{
			System.out.print(0-i+" ");
		}
		else{
			System.out.print(i+" ");
	     }
		i++;
	}
}
	public static void main(String[] args) {
		PositiveNegativeOddEven p = new  PositiveNegativeOddEven();
		p.printEvenodd(10);
	}
}
