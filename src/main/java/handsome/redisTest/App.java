package handsome.redisTest;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Jedis jedis = new Jedis("localhost");//connect redis server
    	 jedis.set("foo", "bar");
         System.out.println("hash value: "+ jedis.get("foo"));
         
         jedis.lpush("list1", "String1");
         jedis.lpush("list1", "String2");
         jedis.lpush("list1", "String3");
         for(String s : jedis.lrange("list1", 0, Integer.MAX_VALUE)){
        	 System.out.println("list value: "+s);
         }
         
         
    }
}
