package org.example.exception;

public class FullArrayException extends RuntimeException {
    public FullArrayException() {
    }

    public FullArrayException(String message) {
        super(message);
    }

    public FullArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullArrayException(Throwable cause) {
        super(cause);
    }

    public FullArrayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
