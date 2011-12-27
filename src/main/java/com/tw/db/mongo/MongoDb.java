package com.tw.db.mongo;

import com.mongodb.Mongo;
import com.tw.db.Db;
import com.tw.db.exception.DbConnectionFailedException;

import java.net.UnknownHostException;

public class MongoDb implements Db {


    private Mongo mongo;
    private boolean isConnected;
    private String host = "localhost";
    private int port = 27017;

    public void connect() {
        try {
            mongo = new Mongo(host, port);
            isConnected = true;
        } catch (UnknownHostException e) {
            new DbConnectionFailedException(e);
        }
    }

    public boolean isConnected() {
        return isConnected;
    }
}
