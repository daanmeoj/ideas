package com.codewithmosh.exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
