package todoapp.storage.cache;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import redis.clients.jedis.Jedis;

import java.util.Optional;

public class RedisRemoteCacheManager implements Cache<String, Token>{

    private final Jedis jedis = new Jedis();
    private final Gson gson = new GsonBuilder().create();

    @Override
    public Optional<Token> get(String key) {
        final String token = jedis.get(key);

        if(Strings.isNullOrEmpty(token)) return Optional.empty();

        return Optional.of(gson.fromJson(token, Token.class));
    }

    @Override
    public void set(String key, Token value) {
        jedis.set(key, gson.toJson(value));
    }

}
