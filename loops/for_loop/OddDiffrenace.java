package loops.second;

public class OddDiffrenace {
void differanceSeries(int n )
{
	int num = 0;
	for(int i = 0 ; num < n ; i ++)
	{
		if(i%2!=0)
		{
			num+=i;
			System.out.print(num + " ");
		}
	}
}
public static void main(String[] args) {
	OddDiffrenace o = new OddDiffrenace();
	o.differanceSeries(100);
}
}
