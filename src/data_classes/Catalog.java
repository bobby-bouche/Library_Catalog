package data_classes;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T> {

	private List<T> items = new ArrayList<>();
	
	
	
	public void addItem(T item) {
		items.add(item);
	}
	
	
	
	public List<T> getAllItems(){
		return items;
	}
	
}
