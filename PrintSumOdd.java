package whileLoop.first;

public class PrintSumOdd {
void printSum(int n )
{
	int  i =0 ;
	int sum =0;
	System.out.print("Printing sum of odd numbers from "+i+ " to till "+n+ " : ");
	while(i<=n)
	{
		if(i%2!=0)
		{
			sum+=i;
		}
		i++;
	}
	System.out.println(sum );
}
public static void main(String[] args) {
	PrintSumOdd p = new PrintSumOdd();
	p.printSum(50);
}
}
