package obobjectOrientedProgramming.pollymorphism.libraryTask;

public class EBook extends LibraryItem {
@Override
void displayInfo()
{
	String format="pdf";
	System.out.println("Book with Title :"+title+" Written by author : "+author+" is at :"+location);
	System.out.println("with format "+format);
}
public static void main(String[] args) {
	EBook e =new EBook();
	e.displayInfo();
}
}
