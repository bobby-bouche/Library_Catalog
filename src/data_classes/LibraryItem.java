package data_classes;

public abstract class LibraryItem {

	// class fields
	private String title;
	private String author;
	private int year;
	private int ISBN;
	
	
	
	// constructor
	public LibraryItem(String title, String author, int year, int isbn) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.ISBN = isbn;
	}



	// getters and setters
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getISBN() {
		return ISBN;
	}



	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}


	
	// toString method
	@Override
	public String toString() {
		return "LibraryItem [title=" + title + ", author=" + author + ", year=" + year + ", ISBN=" + ISBN + "]";
	}
}
