/**
 * 
 */
package ua.dbproject.parsers;

/**
 * The Class ErrorHandler.
 * 
 * @author HAKAN
 */
public class ErrorHandler extends AbstractErrorHandler {

	/** The line number. */
	private int lineNumber;

	/** The exception. */
	private Exception exception;

	/** The error message. */
	private String errorMessage;

	/**
	 * Instantiates a new error handler.
	 * 
	 * @param line
	 *            the line
	 * @param message
	 *            the message
	 * @param exp
	 *            the exp
	 */
	public ErrorHandler(int line, String message, Exception exp) {
		this.setLineNumber(line);
		this.setErrorMessage(message);
		this.setException(exp);
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return ">> line " + getLineNumber() + ":" + getErrorMessage();
	}

}
