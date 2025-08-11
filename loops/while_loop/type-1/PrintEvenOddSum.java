package whileLoop.first;

public class PrintEvenOddSum {

	void printsum(int n )
	{
		int i=1;
		int EvenSum=0;
		int OddSum=0;
	 while(i<=n)
	 {
		 if(i%2==0)
		 {
			 EvenSum+=i;
		 }
		 else {
			 OddSum+=i;
		 }
		 i++;
	 }
	 System.out.println("sum of even and odd numbers from 1 to "+n+" is "+EvenSum+" & "+OddSum);
	}
	public static void main(String[] args) {
		PrintEvenOddSum p= new PrintEvenOddSum();
		p.printsum(100);
	}
}
