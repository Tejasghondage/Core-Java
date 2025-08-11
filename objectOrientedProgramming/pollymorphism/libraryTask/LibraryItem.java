package obobjectOrientedProgramming.pollymorphism.libraryTask;

public class LibraryItem {
String title="Java By Kiran";
String author="Kiran Sir";
String location ="Rack A";
void displayInfo()
{
	System.out.println("Book with Title :"+title+" Written by author : "+author+" is at :"+location);
}
public static void main(String[] args) {
	LibraryItem  l= new LibraryItem();
	l.displayInfo();
}
}
