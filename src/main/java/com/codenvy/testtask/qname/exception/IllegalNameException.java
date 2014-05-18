package com.codenvy.testtask.qname.exception;

/**
 * Class describes exception which throws when input string is incorrect
 */
public class IllegalNameException extends Exception {

    public IllegalNameException(Throwable t, String messege){
        super(messege, t);
    }

    public IllegalNameException(String messege){
        super(messege);
    }
}
