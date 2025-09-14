package exceptions;

@SuppressWarnings("serial")
public class InvalidISBNException extends RuntimeException {

	public InvalidISBNException(String message) {
		super(message);
	}
	
	public InvalidISBNException(Throwable cause) {
		super(cause);
	}
	
	public InvalidISBNException(String message, Throwable cause) {
		super(message, cause);
	}
}
