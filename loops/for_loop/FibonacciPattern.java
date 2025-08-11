package loops.second;

public class FibonacciPattern {
void printFibo(int n )
{
    int first = 0 ; 
	int second= 1;
	int next;
	System.out.print(first+" ");
	for(int i=0 ; i<n ; i++)
	{
		next = first+second;
		System.out.print(next+" ");
		second =first;
		first = next;
		
	}
}
public static void main(String[] args) {
	FibonacciPattern f = new FibonacciPattern();
	f.printFibo(8);
}
}
