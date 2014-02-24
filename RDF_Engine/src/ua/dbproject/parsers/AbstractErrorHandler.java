package ua.dbproject.parsers;

/**
 * The Class AbstractErrorHandler.
 */
public abstract class AbstractErrorHandler {

	/**
	 * Gets the line number.
	 * 
	 * @return the line number
	 */
	abstract public int getLineNumber();

	/**
	 * Gets the exception.
	 * 
	 * @return the exception
	 */
	abstract public Exception getException();

	/**
	 * Gets the error message.
	 * 
	 * @return the error message
	 */
	abstract public String getErrorMessage();

	/**
	 * Sets the line number.
	 * 
	 * @param lineNumber
	 *            the new line number
	 */
	abstract public void setLineNumber(int lineNumber);

	/**
	 * Sets the exception.
	 * 
	 * @param exception
	 *            the new exception
	 */
	abstract public void setException(Exception exception);

	/**
	 * Sets the error message.
	 * 
	 * @param errorMessage
	 *            the new error message
	 */
	abstract public void setErrorMessage(String errorMessage);
}
