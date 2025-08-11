package whileLoop.second;

public class IncremetalSeriesDifferance {
void printSeries(int n )
{
	int i=1;
	int num = 0 ;
	while(num<n)
	{
		num  = num+i++;
		System.out.print(num+" ");
	}
}
	public static void main(String[] args) {
		IncremetalSeriesDifferance i =new IncremetalSeriesDifferance();
		i.printSeries(45);
	}
}
