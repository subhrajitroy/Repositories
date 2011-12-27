package com.tw.db.mongo;


import com.tw.db.Db;
import com.tw.db.DbConnection;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MongoDbTest {

    @Test
    public void shouldConnectToRunningMongoDb(){
        Db mongoDb = new MongoDb();
        mongoDb.connect();
        assertThat(mongoDb.isConnected(), Is.is(true));
    }
}
