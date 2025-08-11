package whileLoop.second;

public class SeriesOddDifferance {
void printSeries(int n )
{ int i=1;
int num=0;
while(num<n)
{
	if(i%2!=0)
	{
		num+=i;
		System.out.print(num+" ");
	}
	i++;
}
}
	public static void main(String[] args) {
		SeriesOddDifferance s = new SeriesOddDifferance();
		s.printSeries(100);
	}
}
