package loops.second;

public class Multiple {
void printmultiple(int multiple , int power )
{ int sum = 1;
	for(int i = 0; i<=power; i++)
	{
		System.out.print(sum+" ");
		sum*=multiple;
	}
}
public static void main(String[] args) {
	Multiple m = new Multiple();
	m.printmultiple(10, 3);
}
}
