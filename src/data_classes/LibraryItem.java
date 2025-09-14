package data_classes;

import java.time.Year;
import java.util.regex.Pattern;

import exceptions.InvalidAuthorException;
import exceptions.InvalidISBNException;
import exceptions.InvalidTitleException;
import exceptions.InvalidYearException;

public abstract class LibraryItem {

	// class fields
	private String title;
	private String author;
	private int year;
	private String ISBN;
	
	
	
	// current year
	private static int current_year = Year.now().getValue();
	
	
	
	// sysbolic constants
	private static final int MAX_TITLE_LENGTH  = 50;
	private static final int MAX_AUTHOR_LENGTH = 50;
	private static final Pattern ISBN_PATTERN  = Pattern.compile(
			"^(?:\\d[ -]?){9}[\\dX]$|^(?:97[89][ -]?\\d[ -]?){12}\\d$");
	
	
	
	// constructor
	public LibraryItem(String title, String author, int year, String isbn) {
		validateTitle(title);
		this.title = title;
		validateAuthor(author);
		this.author = author;
		validateYear(year);
		this.year = year;
		validateISBN(isbn);
		this.ISBN = isbn;
	}

	
	
	// validation methods
	private static void validateTitle(String title) {
		if(title.isEmpty() || title.length() > MAX_TITLE_LENGTH) {
			throw new InvalidTitleException("Invalid title: " + title + ". Max length is 50 characters. ");
		}
	}
	
	private static void validateAuthor(String author) {
		if(author.isEmpty() || author.length() > MAX_AUTHOR_LENGTH) {
			throw new InvalidAuthorException("Invalid title: " + author + ". Max length is 50 characters. ");
		}
	}
	
	private static void validateYear(int year) {
		if(year > current_year) {
			throw new InvalidYearException("Invalid year: " + year + ". Only books that are released as of " + current_year + " can be addded.");
		}
	}
	
	private static void validateISBN(String isbn) {
		if(isValidISBN(isbn) == false) {
			throw new InvalidISBNException("Invalid ISBN: " + isbn);
		}
	}
	
	private static boolean isValidISBN(String isbn) {
		return ISBN_PATTERN.matcher(isbn).matches();
	}
	

	
	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		validateTitle(title);
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		validateAuthor(author);
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		validateYear(year);
		this.year = year;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String isbn) {
		validateISBN(isbn);
		ISBN = isbn;
	}


	
	// toString method
	@Override
	public String toString() {
		return "LibraryItem [title=" + title + ", author=" + author + ", year=" + year + ", ISBN=" + ISBN + "]";
	}
}
