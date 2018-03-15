package cn.ylcto.util.Redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class RedisDBFactory {

    private static JedisPool jedisPool = null;

    static{
        ResourceBundle bundle = ResourceBundle.getBundle("redisDB");
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(Integer.parseInt(bundle.getString("redis.maxId")));
        jedisPoolConfig.setMinIdle(Integer.parseInt(bundle.getString("redis.minId")));
        jedisPoolConfig.setMaxTotal(Integer.parseInt(bundle.getString("redis.maxTotal")));
        jedisPool = new JedisPool(jedisPoolConfig,bundle.getString("redis.ip"),Integer.parseInt(bundle.getString("redis.port")));
    }


public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}