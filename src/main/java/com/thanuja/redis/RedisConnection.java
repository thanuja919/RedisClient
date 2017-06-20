/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanuja.redis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

/**
 *
 * @author thanuja
 */
public class RedisConnection {

    private static JedisPool jedisPool;

    /**
     * Returns a pool of Jedis connections. Create Create a new pool of Jedis
     * connections if jedisPool is null.
     *
     * @return JedisPool
     */
    protected static JedisPool getJedisPool() {

        if (null == jedisPool) {
            createJedisPool();

        }
        return jedisPool;

    }

    /**
     * Create a new pool of Jedis connections.
     */
    private static void createJedisPool() {

        String host = "192.168.56.102";
        int port = 6379;

        jedisPool = new JedisPool(host, port);

        /*
        For a secured redis installation the following constructor can be used to create the JedisPool
        */
        
        //JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // int timeout = Protocol.DEFAULT_TIMEOUT;
        //String password = null;
        //jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password);
    }
}
