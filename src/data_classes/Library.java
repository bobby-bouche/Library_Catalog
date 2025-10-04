package data_classes;

import java.util.ArrayList;
import java.util.HashMap;

import exceptions.ItemNotFoundException;

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
	
	
	
	
	public void addItem(Book book) {
		bookCatalog.addItemToCatalog(book.getISBN(), book);
	}
	
	
	public void findItemByISBN(String isbn) {
		try {
			HashMap<String, Book> books = new HashMap<>();
			books = bookCatalog.getAllItemsFromCatalog();
			if(books.get("0306406152") != null) {
				System.out.println("Found it!");
			}
			else {
				throw new ItemNotFoundException("Item not found");
			}	
		}
		catch(ItemNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void registerAccount(int accountNumber) {
		
	}
	
	
	public void borrowItem(int accountNumber, String isbn) {
		
	}
}
