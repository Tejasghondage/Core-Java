package whileLoop.second;

public class TenthPower {
	void printPower(int n )
	{
		int i =0;
		int num=1;
		int differance= 10;
		while(i<=3){
			
			System.out.print(num+" ");
			num*=differance;
			i++;
		}
	}
public static void main(String[] args) {
	TenthPower t = new TenthPower();
	t.printPower(3);
}
}
