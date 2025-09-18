package driver;

import java.util.HashMap;

import data_classes.Book;
import data_classes.Catalog;
import data_classes.LibraryAccount;
import data_classes.LibraryItem;
import exceptions.ItemNotFoundException;



public class Driver {
	

	public static void main(String[] args) {
		
		// #1
		// creates 6 book objects
		Book book1 = new Book("LOTR", "JRR Tolkein", 1934, "0306406152");
		Book book2 = new Book("HOBBIT", "JRR Tolkein", 1931, "0140449132");
		Book book3 = new Book("ERAGON", "PAULO NUBLI", 2006, "0-486-65088-X");
		Book book4 = new Book("HARRY WILSO", "JRR Tolkein", 1922, "0306406567");
		Book book5 = new Book("STONE DRGAONS", "JRR Tolkein", 1956, "0140669132");
		Book book6 = new Book("TEMPLE KINGS", "PAULO NUBLI", 2008, "0-446-65688-X");
		
		// creates a catalog object
		Catalog<Book> log = new Catalog<>();
		
		// adds 3 books to catalog
		log.addItemToCatalog(book1.getISBN(), book1);
		log.addItemToCatalog(book2.getISBN(), book2);
		log.addItemToCatalog(book3.getISBN(), book3);
		
		System.out.println(log.getAllItemsFromCatalog().size());
		
		
		
		// #2
		try {
			HashMap<String, Book> books = new HashMap<>();
			books = log.getAllItemsFromCatalog();
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
		
		

		System.out.println("==============================\n");
		
		
		
		// #3
		LibraryAccount account1 = new LibraryAccount(1234);
	    account1.borrowItem(book1);
	    account1.borrowItem(book2);
	    account1.borrowItem(book3);
	    account1.borrowItem(book4);
	    account1.borrowItem(book5);
	  //  System.out.println("My borrowed items: " + account1.getBorrowedItems().size());
	    account1.borrowItem(book6);
		// TODO account1.returnItem();
		// System.out.println(account1.getBorrowedItems());
		
		// #4

		//System.out.println("My borrowed items: " + account1.getBorrowedItems().size() + " - " + account1.getBorrowedItems());
	}
	
	
}
