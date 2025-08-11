package constructor.library;

public class LibraryBook {
String title;
String author;
String isbn;
boolean avaliable;
LibraryBook(String title ,String author,String isbn)
{
	this.title=title;
	this.author=author;
	this.isbn=isbn;
	this.avaliable =true;
	
}
void borrowBook(String bookTitle)
{
	if(bookTitle==this.title)
	{
		if(this.avaliable==true)
		{
		System.out.println("you have borrowed  book with title :"+title+" and isbn: "+this.isbn);
		this.avaliable=false;
		}
		else {
			System.out.println("Sorry Book is not avlalialbe ...");
		}
	}
	
}
void returnBook()
{
	System.out.println("Your borrwoed book with title :"+this.title+" recived !!");
    this.avaliable=true;
}
public static void main(String[] args) {
	LibraryBook  l=new LibraryBook("java by Kiran","kiran","ISB232");
	l.borrowBook("java by Kiran");
	l.borrowBook("java by Kiran");
	l.returnBook();
			
}
}
