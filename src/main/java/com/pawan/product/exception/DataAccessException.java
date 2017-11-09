package com.pawan.product.exception;

public class DataAccessException extends Exception {

	private static final long serialVersionUID = 1L;
	private int code;

    public DataAccessException() {
        super();
    }
    
    public DataAccessException(Exception e) {
        super(e);
    }

    public DataAccessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}