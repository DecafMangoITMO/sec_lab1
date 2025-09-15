package dev.decafmango.sec_lab1.exception;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {

    private final Reason reason;

    public ApplicationException(String message, Reason reason) {
        super(message);
        this.reason = reason;
    }

    public enum Reason {
        ALREADY_EXISTS,
    }

}
