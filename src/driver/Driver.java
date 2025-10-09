package driver;

import java.util.HashMap;
import data_classes.Book;
import data_classes.Library;
import exceptions.ItemNotFoundException;


public class Driver {
	
	// driver fields
	private static Library library;
	

	
	// constructor
	public Driver() {
		library = new Library();
	}
	
	
	// method to load data to Library
	public void loadlibrary() {
		
		// load library litem data
		Book book1 = new Book("LOTR", "JRR Tolkein", 1934, "0306406152");
		Book book2 = new Book("HOBBIT", "JRR Tolkein", 1931, "0140449132");
		Book book3 = new Book("ERAGON", "PAULO NUBLI", 2006, "0-486-65088-X");
		Book book4 = new Book("HARRY WILSO", "JRR Tolkein", 1922, "0306406567");
		Book book5 = new Book("STONE DRGAONS", "JRR Tolkein", 1956, "0140669132");
		Book book6 = new Book("TEMPLE KINGS", "PAULO NUBLI", 2008, "0-446-65688-X");
		
		// #1
		library.getBookCatalog().addItemToCatalog(book1.getISBN(), book1);
		library.getBookCatalog().addItemToCatalog(book2.getISBN(), book2);
		library.getBookCatalog().addItemToCatalog(book3.getISBN(), book3);
		library.getBookCatalog().addItemToCatalog(book4.getISBN(), book4);
		library.getBookCatalog().addItemToCatalog(book5.getISBN(), book5);
		library.getBookCatalog().addItemToCatalog(book6.getISBN(), book6);	
	}
	
	
	
	// method to run program
	public void runProgram() {
		try {
			
			// #2
			HashMap<String, Book> books = new HashMap<>();
			books = library.getBookCatalog().getAllItemsFromCatalog();
			if(books.get("0306406152") != null) {
				System.out.println("Found it!");
			}
			else {
				throw new ItemNotFoundException("Item not found");
			}
			
			System.out.println("==============================\n");
			
			
			// #3
			
			
			
			// #4
			//System.out.println("My borrowed items: " + account1.getBorrowedItems().size() + " - " + account1.getBorrowedItems());
			
		}
		catch(ItemNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// main method
	public static void main(String[] args) {
		
		Driver driver;
		driver = new Driver();
		
		try {	
			
			driver.loadlibrary();
			driver.runProgram();
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
	
	
}
