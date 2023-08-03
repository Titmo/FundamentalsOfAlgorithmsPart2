package org.example.exception;

public class ElementNotFaund extends RuntimeException {
    public ElementNotFaund() {
    }

    public ElementNotFaund(String message) {
        super(message);
    }

    public ElementNotFaund(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFaund(Throwable cause) {
        super(cause);
    }

    public ElementNotFaund(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
