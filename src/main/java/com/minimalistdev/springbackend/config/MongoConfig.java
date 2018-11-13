package com.minimalistdev.springbackend.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import java.util.Optional;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Autowired
    private Environment env;

    @Override
    public MongoClient mongoClient() {

        String host = Optional.ofNullable(env.getProperty("DB_HOST")).orElse("127.0.0.1");
        Integer port = Integer.valueOf(Optional.ofNullable(env.getProperty("DB_PORT")).orElse("27017"));

        return new MongoClient(host,
                port);
    }

    @Override
    protected String getDatabaseName() {
        String dbName = Optional.ofNullable(env.getProperty("DB_NAME")).orElse("test");
        return dbName;
    }
}
