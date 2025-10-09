package data_classes;

import java.util.HashMap;

public class Catalog<T> {

	private HashMap<String, T> libraryCatalog = new HashMap<>();
	
	
	
	public void addItemToCatalog(String isbn, T item) {
		libraryCatalog.put(isbn, item);
	}
	
	
	
	public HashMap<String, T> getAllItemsFromCatalog(){
		return libraryCatalog;
	}
	
	
}
