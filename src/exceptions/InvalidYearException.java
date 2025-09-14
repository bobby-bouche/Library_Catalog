package exceptions;

@SuppressWarnings("serial")
public class InvalidYearException extends RuntimeException {

	public InvalidYearException(String message) {
		super(message);
	}
	
	public InvalidYearException(Throwable cause) {
		super(cause);
	}
	
	public InvalidYearException(String message, Throwable cause) {
		super(message, cause);
	}
}
