package com.example.service;

import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Map;

@Singleton
public class CacheService {
    @Inject
    StatefulRedisConnection<String, String> connection;

    public void putData(String key,String value){
        RedisCommands<String, String> commands = connection.sync();
        commands.set(key,value);
    }
    public String getData(String key){
        RedisCommands<String, String> commands = connection.sync();
        return commands.get(key);
    }
}
