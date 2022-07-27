package todoapp.storage.cache;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import redis.clients.jedis.Jedis;

import java.util.Optional;

public class RedisRemoteCacheManager implements Cache<String, String>{

    private final Jedis jedis = new Jedis();
    private final Gson gson = new GsonBuilder().create();

    @Override
    public Optional<String> get(String key) {
        final String token = jedis.get(key);

        if(Strings.isNullOrEmpty(token)) return Optional.empty();

        return Optional.of(gson.fromJson(token, String.class));
    }

    @Override
    public void set(String key, String value) {
        jedis.set(key, gson.toJson(value));
    }

}
