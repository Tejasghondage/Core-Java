package whileLoop.second;

public class ForwordBackword {
	void printSeries()
	{
		int i=1;
		while(i<=5)
		{
			System.out.print(i+" ");
			i++;
		}
		i-=2;
		while(i>0)
		{
			System.out.print(i+" ");
			i--;
		}
	}
public static void main(String[] args) {
	
	ForwordBackword f = new ForwordBackword();
	f.printSeries();
			
}
}
