package whileLoop.first;

public class PrintEven {
void printEven(int n )
{
	int i=1;
	System.out.println("printing even numbers from "+i+" to till "+n);
	while(i<=n)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
		i++;
	}
}
public static void main(String[] args) {
	PrintEven p=new PrintEven();
	p.printEven(100);
}
}
