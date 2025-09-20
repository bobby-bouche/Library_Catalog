package data_classes;

import java.util.ArrayList;

import exceptions.BorrowLimitExceededException;

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
	
	
	public void borrowItem(LibraryItem item) {

		if(this.borrowedItems.size() == 5) {
			throw new BorrowLimitExceededException("Reached max amount of items you can borrow.");
		}
		else if(borrowedItems.contains(item)) {
			System.out.println("This item can only be borrowed once at any given period.");
		}
		else {
			borrowedItems.add(item);
			System.out.println("Item borrowed");
		}
	}
	

	
	// toString
	@Override
	public String toString() {
		return "LibraryAccount [accNumber=" + accNumber + ", borrowedItems=" + borrowedItems + "]";
	}
}
