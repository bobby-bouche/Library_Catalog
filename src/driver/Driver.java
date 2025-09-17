package driver;

import java.util.HashMap;

import data_classes.Book;
import data_classes.Catalog;
import data_classes.LibraryAccount;



public class Driver {
	

	public static void main(String[] args) {
		
		// #1
		Book book1 = new Book("LOTR", "JRR Tolkein", 1934, "0306406152");
		Book book2 = new Book("HOBBIT", "JRR Tolkein", 1931, "0140449132");
		Book book3 = new Book("ERAGON", "PAULO NUBLI", 2006, "0-486-65088-X");
	
		Catalog<Book> log = new Catalog<>();
		
		log.addItemToCatalog(book1.getISBN(), book1);
		log.addItemToCatalog(book2.getISBN(), book2);
		log.addItemToCatalog(book3.getISBN(), book3);
		
		// #2
		HashMap<String, Book> books = new HashMap<>();
		books = log.getAllItemsFromCatalog();
		System.out.println(books);
		
		
		LibraryAccount account1 = new LibraryAccount(1234);
	
	}
}
