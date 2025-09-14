package exceptions;

@SuppressWarnings("serial")
public class BorrowLimitExceededException extends RuntimeException {

	public BorrowLimitExceededException(String message) {
		super(message);
	}
	
	public BorrowLimitExceededException(Throwable cause) {
		super(cause);
	}
	
	public BorrowLimitExceededException(String message, Throwable cause) {
		super(message, cause);
	}
}
