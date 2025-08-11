package whileLoop.first;

public class PrintNegativePositive {
	void printNum(int n )
	{
		int i = 0-n;
		System.out.println("printing numbers from "+i+"to "+n );
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
	}

	public static void main(String[] args) {
		PrintNegativePositive p = new PrintNegativePositive();
		p.printNum(45);
	}
}
