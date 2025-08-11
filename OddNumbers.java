package whileLoop.first;

public class OddNumbers {
void printOdd(int n )
{
	System.out.println("Printing odd numbers till "+n);
	int i =1;
	while(i<=n)
	{
		if(i%2!=0)
		{
			System.out.print(i+" ");
		}
		i++;
	}
}
	public static void main(String[] args) {
		OddNumbers o = new OddNumbers();
		o.printOdd(100);
	}
}
