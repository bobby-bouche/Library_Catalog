package data_classes;

import java.util.ArrayList;

public class LibraryAccount {
	
	
	//fields
	private int accNumber;
	private ArrayList<LibraryItem> borrowedItems;

	
	
	// constructor
	public LibraryAccount(int accNum) {
		super();
		this.setAccNumber(accNum);
		borrowedItems  = new ArrayList<>();
	}



    // get and set methods
	public int getAccNumber() {
		return accNumber;
	}



	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}



	public ArrayList<LibraryItem> getBorrowedItems() {
		return borrowedItems;
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return "LibraryAccount [accNumber=" + accNumber + ", borrowedItems=" + borrowedItems + "]";
	}
}
