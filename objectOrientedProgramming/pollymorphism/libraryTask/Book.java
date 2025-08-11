package obobjectOrientedProgramming.pollymorphism.libraryTask;

public class Book extends LibraryItem{
@Override

void displayInfo()
{
	String genere="EduTech";
	int numberOfPages=525;
	System.out.println("Book with Title :"+title+" Written by author : "+author+" is at :"+location);
	System.out.println(" having Genere :"+genere+" and Number of pages :"+numberOfPages);
}
public static void main(String[] args) {
	Book  l= new Book();
	l.displayInfo();
}
}
