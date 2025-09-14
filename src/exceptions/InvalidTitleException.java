package exceptions;

@SuppressWarnings("serial")
public class InvalidTitleException extends RuntimeException {

	public InvalidTitleException(String message) {
		super(message);
	}
	
	public InvalidTitleException(Throwable cause) {
		super(cause);
	}
	
	public InvalidTitleException(String message, Throwable cause) {
		super(message, cause);
	}
}
