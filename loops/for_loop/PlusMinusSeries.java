package loops.second;

public class PlusMinusSeries {
void PrintSeries(int n )
{
	for(int i = 1 ; i <= n;i++)
	{
		if(i%2==0)
		{
			System.out.print(+(0-i)+" ");
		}
		else {
			System.out.print(i);
		}
	}
}
public static void main(String[] args) {
	PlusMinusSeries p =new PlusMinusSeries();
	p.PrintSeries(10);
}
}
