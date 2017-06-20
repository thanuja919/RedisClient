package com.thanuja.redis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        RedisClient.setKey("name", "thanuja", 300);
        System.out.println(RedisClient.getKey("name"));
        System.out.println(RedisClient.getTtl("name"));
    }
}
