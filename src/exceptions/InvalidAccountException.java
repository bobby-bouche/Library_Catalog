package exceptions;


@SuppressWarnings("serial")
public class InvalidAccountException extends Exception {

	public InvalidAccountException(String message) {
		super(message);
	}
	
	public InvalidAccountException(Throwable cause) {
		super(cause);
	}
	
	public InvalidAccountException(String message, Throwable cause) {
		super(message, cause);
	}
}
