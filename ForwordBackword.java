package loops.second;

public class ForwordBackword {
void printpattern(int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		System.out.print((i+1)+" ");
	}
	for(int j = i-1  ; j >0;j--)
	{
		System.out.print(j+" ");
	}
}
public static void main(String[] args) {
	ForwordBackword f=new ForwordBackword();
	f.printpattern(5);
}
}
