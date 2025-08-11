package whileLoop.second;

public class Tables {

	void printTable(int n )
	{
		int i = 1;
		while(i<=10)
		{
			System.out.print(i*n+" ");
			i++;
		}
	}
	public static void main(String[] args) {
		Tables t = new Tables();
		t.printTable(9);
	}
}
