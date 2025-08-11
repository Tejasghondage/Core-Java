package whileLoop.first;

public class PrintRevNumbers {
void printer(int n )
{
	System.out.println("Printing numbers from "+n+" in reverse order till 0 ");
	while(n>0)
	{
		System.out.print(n+" ");
		n--;
	}
}
	public static void main(String[] args) {
		PrintRevNumbers p = new PrintRevNumbers();
		p.printer(25);
	}
}
