package ua.dbproject.parsers;

import java.util.ArrayList;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * The listener interface for receiving error events. The class that is
 * interested in processing a error event implements this interface, and the
 * object created with that class is registered with a component using the
 * component's <code>addErrorListener<code> method. When
 * the error event occurs, that object's appropriate
 * method is invoked.
 * 
 * @author HAKAN
 */
public class ErrorListener extends BaseErrorListener {

	/** The error list. */
	private ArrayList<ErrorHandler> errorList;

	/**
	 * Instantiates a new error listener.
	 */
	public ErrorListener() {
		errorList = new ArrayList<ErrorHandler>();
	}

	/*
	 * as long as a syntax error appears in the grammars, this method is being
	 * invoked!
	 */
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		ErrorHandler error = new ErrorHandler(charPositionInLine, msg, e);
		this.addError(error);
	}

	/**
	 * Gets the error list.
	 * 
	 * @return the error list
	 */
	public ArrayList<ErrorHandler> getErrorList() {
		return errorList;
	}

	/**
	 * Adds the error.
	 * 
	 * @param errorList
	 *            the error list
	 */
	private void addError(ErrorHandler errorList) {
		this.errorList.add(errorList);
	}

	/**
	 * Checks whether the error list is empty.
	 * 
	 * @return true, if the list is empty
	 */
	public boolean isEmpty() {
		return this.getErrorList().size() == 0 ? true : false;
	}

}
