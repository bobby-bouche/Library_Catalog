package data_classes;

import interfaces.Borrowable;

public class Book extends LibraryItem implements Borrowable{
	

	public Book(String title, String author, int year, String isbn) {
		super(title, author, year, isbn);
		
	}

}
