package com.example.schoolmanagement.Database;
import com.lambdaworks.redis.*;

import java.util.ArrayList;
import java.util.List;

public class RedisCRUD {
    public static void main(String[] args) {
        RedisClient redisClient = new RedisClient(
                RedisURI.create("redis://4Fb6xdfJrmdsyhoFSBlfVzWhZADab8Cr@redis-17809.c124.us-central1-1.gce.cloud.redislabs.com:17809"));
            RedisConnection<String, String> connection = redisClient.connect();
        System.out.println("Connected to Redis");
//        List<String> emty = new ArrayList<>();
//        emty.add("mmg");
//        emty.add("mmg2");
//        emty.add("mmg3");
//        connection.set("List",emty.toString());
        System.out.println(connection.get("List"));
        connection.close();
        redisClient.shutdown();
    }
}