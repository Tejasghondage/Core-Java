package whileLoop.first;

public class PrintCountOfEvenOdd {
 void printCount(int n )
 {
	 int i = 1;
	 int countEven=0;
	 int countOdd=0;
	  while(i<=n)
	  {
		  if(i%2==0)
		  {
			  countEven++;
		  }
		  else {
			  countOdd++;
		  }
		  i++;
	  }
	  System.out.println("Count of even and odd numbers from 1 to "+n+" is "+countEven+" and "+countOdd);
 }
	public static void main(String[] args) {
		PrintCountOfEvenOdd p = new PrintCountOfEvenOdd();
		p.printCount(50);
	}
}
