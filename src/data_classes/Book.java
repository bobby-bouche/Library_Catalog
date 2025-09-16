package data_classes;

import interfaces.Borrowable;

public class Book extends LibraryItem implements Borrowable{
	

	// constructor
	public Book(String title, String author, int year, String isbn) {
		super(title, author, year, isbn);
	}

	
	
	// overridden methods from Borrowable
	@Override
	public void isBorrowed() {
		System.out.println(this.getTitle() + " is now borrowed..");	
	}

	@Override
	public void isReturned() {
		System.out.println(this.getTitle() + " has now been returned..");
	}
	
	
}
