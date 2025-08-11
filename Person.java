package constructor.library;

public class Person {
String name;
int age ;
Person(String name , int age )
{
	this.name=name;
	this.age=age;
}
void show()
{
	System.out.println(this.name+"'s age is : "+this.age);
}
public static void main(String[] args) {
	Person p = new Person("Tejas", 21);
	Person p2 = new Person("Trupti", 21);
	p.show();
	p2.show();

}
}
