import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

import java.util.List;

public class RedisExample {

    public static void main(String args[]){
        RedisClient redisClient = RedisClient.create("redis://localhost:6379/");
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        RedisCommands<String, String> syncCommands = connection.sync();

        syncCommands.set("mykey", "Hello from Lettuce!");
        String value = syncCommands.get("mykey");
        System.out.println( value );

        syncCommands.zadd("vehicles", 0, "car");
        syncCommands.zadd("vehicles", 0, "bike");
        List<String> vehicles = syncCommands.zrange("vehicles", 0, -1);
        System.out.println( vehicles );

        connection.close();
        redisClient.shutdown();
    }

}
