package cn.ylcto.util.Redis;

import redis.clients.jedis.Jedis;

import java.util.Map;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = RedisDBFactory.getJedis();
        String name = jedis.get("name");
        String user = jedis.get("user");
        System.out.println(name);
        System.out.println(user);
        Map users = jedis.hgetAll("users");
        System.out.println(users.toString());;
        jedis.close();



    }
}
