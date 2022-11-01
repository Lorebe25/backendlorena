package com.lorena.ap.Exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException( String message){
        super(message);
    }
}
