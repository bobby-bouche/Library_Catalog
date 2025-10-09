package data_classes;

import java.util.ArrayList;
import java.util.HashMap;

import exceptions.InvalidAccountException;
import exceptions.ItemNotFoundException;

public class Library {
	
	// fields
	private ArrayList<LibraryAccount> libraryAccounts;
	private Catalog<Book> bookCatalog;

	
	// constructor
	public Library() {
		super();
		libraryAccounts = new ArrayList<>();
		bookCatalog     = new Catalog<>();
	}


	public ArrayList<LibraryAccount> getLibraryAccounts() {
		return libraryAccounts;
	}


	public Catalog<Book> getBookCatalog() {
		return bookCatalog;
	}
	
	
	public void addItem(Book book) {
		bookCatalog.addItemToCatalog(book.getISBN(), book);
	}
	
	
	public Book findItemByISBN(String isbn) {
		try {
			HashMap<String, Book> books = new HashMap<>();
			books = bookCatalog.getAllItemsFromCatalog();
			if(books.get(isbn) != null) {
				System.out.println("Found it!");
				return books.get(isbn);
			}
			else {
				throw new ItemNotFoundException("Item not found");
			}	
		}
		catch(ItemNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void registerAccount(int accountNumber) {
		try {
			for(LibraryAccount account : libraryAccounts) {
				if(account.getAccNumber() == accountNumber) {
					throw new InvalidAccountException("Error. Account already Exists..");
				}
			}
			LibraryAccount newAccount = new LibraryAccount(accountNumber);
			libraryAccounts.add(newAccount);
			System.out.println("Account registered..");
		}
		catch(InvalidAccountException e) {
			e.printStackTrace();
		}
	}
	
	
	public void borrowItem(int accountNumber, String isbn) {
		try {
			for(LibraryAccount account : libraryAccounts) {
				if(account.getAccNumber() != accountNumber) {
					throw new InvalidAccountException("Error. Account not on record..");
				}
		
			}
			
		}
		catch(InvalidAccountException e) {
			e.printStackTrace();
		}
	}
}
