package com.tw.db.exception;

import java.net.UnknownHostException;

public class DbConnectionFailedException extends RuntimeException{
    public DbConnectionFailedException(Exception e) {
        super(e);
    }
}
