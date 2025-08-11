package obobjectOrientedProgramming.pollymorphism.libraryTask;

public class DVD extends LibraryItem{
	@Override
	void displayInfo()
	{
		String director="xyz";
		double runTime=1.34;
		System.out.println("Book with Title :"+title+" Written by author : "+author+" is at :"+location);
		System.out.println("with Director "+director +" runtime : "+runTime+" mins");
	}
public static void main(String[] args) {
	DVD d = new DVD();
	d.displayInfo();
}
}
