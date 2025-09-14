package exceptions;

@SuppressWarnings("serial")
public class InvalidAuthorException extends RuntimeException {

	public InvalidAuthorException(String message) {
		super(message);
	}
	
	public InvalidAuthorException(Throwable cause) {
		super(cause);
	}
	
	public InvalidAuthorException(String message, Throwable cause) {
		super(message, cause);
	}
}

