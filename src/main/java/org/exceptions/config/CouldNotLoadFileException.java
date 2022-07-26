package org.exceptions.config;

public class CouldNotLoadFileException extends RuntimeException {

    public CouldNotLoadFileException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
