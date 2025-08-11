package loops.second;

public class DifferancePattern {
	void PrintDiffreance(int n )
	{
		int sum =0;
		int differance = 1;
		for(;sum <n;) 
		{
			 sum =sum+(differance++);
			System.out.print(sum+" ");
		}
	}
public static void main(String[] args) {
	DifferancePattern d= new DifferancePattern();
	d.PrintDiffreance(45);
}
}
