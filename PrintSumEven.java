package whileLoop.first;

public class PrintSumEven {

void printsum ( int n )
{ int i =1;
  int sum = 0 ;
	System.out.print("printing sum even numbers from "+i+" to till "+n + " : ");
	while(i<=n)
	{
		if(i%2==0)
		{
			sum+=i;
		}
		i++;
	}
	System.out.print(sum);
}
	public static void main(String[] args) {
		PrintSumEven p = new PrintSumEven();
		p.printsum(50);
	}
}
