package loops.second;

public class Tables {
	void printTables(int n)
	{
	 for(int i=1; i<=10;i++)
	 {
		 System.out.print(+n*i+" ");
	 }
	}
public static void main(String[] args) {
	Tables t = new Tables();
	t.printTables(9);
}
}
