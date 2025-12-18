package org.java.micro.example.todoapp.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) { super(message); }
}