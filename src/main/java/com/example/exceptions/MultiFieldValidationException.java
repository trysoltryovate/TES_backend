
package com.example.exceptions;

import java.util.List;

public class MultiFieldValidationException extends RuntimeException {
    private List<String> errorMessages;

    public MultiFieldValidationException(List<String> errorMessages) {
        super("Multiple validation errors occurred.");
        this.errorMessages = errorMessages;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }
}

