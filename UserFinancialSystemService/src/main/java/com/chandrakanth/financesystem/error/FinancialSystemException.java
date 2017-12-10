package com.chandrakanth.financesystem.error;

import java.util.List;

public class FinancialSystemException extends Exception {

	public FinancialSystemException() {
		super();
	}

	private List<Exception> exceptionList = null;

	private List<String> errorMessageList = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FinancialSystemException(Exception e) {

	}

	public List<Exception> getExceptionList() {
		return exceptionList;
	}

	public void setExceptionList(List<Exception> exceptionList) {
		this.exceptionList = exceptionList;
	}

	public List<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(List<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}

	public FinancialSystemException(List<String> exceptionMessageList) {
		errorMessageList = exceptionMessageList;
	}

	public FinancialSystemException(List<Exception> exceptionList, List<String> exceptionMessagelist) {
		errorMessageList = exceptionMessagelist;
		this.exceptionList = exceptionList;
	}

}
