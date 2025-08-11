package whileLoop.first;

public class PrintNumbers {
void Printer(int n )
{ int i =1;
System.out.println("printing numbers from "+i+" to "+n);
	while(i<=25)
	{
		System.out.print(i+" ");
		i++;
	}
}
public static void main(String[] args) {
	PrintNumbers p=new PrintNumbers();
	p.Printer(25);
}
}
