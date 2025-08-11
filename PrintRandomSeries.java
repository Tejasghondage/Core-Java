package whileLoop.first;

public class PrintRandomSeries {
	void printSeries(int m , int n )
	{
		System.out.println("Printing number series  from "+m+" till "+n);
		while(m<=n)
		{
			System.out.print(m+ " ");
			m++;
		}
	}
	
 public static void main(String[] args) {
	 PrintRandomSeries p =new PrintRandomSeries ();
	 p.printSeries(50,100);
}
}
