package com.var.exception;

public class MissedCallAlertNotFoundException extends RuntimeException {
    public MissedCallAlertNotFoundException(String message) {
        super(message);
    }
}
