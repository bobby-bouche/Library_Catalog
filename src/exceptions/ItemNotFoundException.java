package exceptions;

@SuppressWarnings("serial")
public class ItemNotFoundException extends Exception {

	public ItemNotFoundException(String message) {
		super(message);
	}
	
	public ItemNotFoundException(Throwable cause) {
		super(cause);
	}
	
	public ItemNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
