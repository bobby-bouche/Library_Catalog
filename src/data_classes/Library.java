package data_classes;

import java.util.ArrayList;

public class Library {
	
	// fields
	private ArrayList<Integer> libraryAccounts;
	private Catalog<Book> bookCatalog;

	
	// constructor
	public Library() {
		super();
		libraryAccounts = new ArrayList<>();
		bookCatalog     = new Catalog<>();
	}


	public ArrayList<Integer> getLibraryAccounts() {
		return libraryAccounts;
	}


	public Catalog<Book> getBookCatalog() {
		return bookCatalog;
	}
	
}
