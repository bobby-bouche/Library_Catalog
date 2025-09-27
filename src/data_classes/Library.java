package data_classes;

import java.util.ArrayList;

public class Library {
	
	// fields
	private ArrayList<Integer> libraryAccounts;

	
	// constructor
	public Library() {
		super();
		libraryAccounts = new ArrayList<>();
	}


	public ArrayList<Integer> getLibraryAccounts() {
		return libraryAccounts;
	}
	
}
