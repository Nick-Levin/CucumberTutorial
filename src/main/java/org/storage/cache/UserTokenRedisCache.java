package org.storage.cache;

import com.google.common.collect.Maps;
import org.security.Token;

import java.util.Map;
import java.util.Optional;

public class UserTokenRedisCache implements Cache<String, Token> {

    private final Map<String, Token> cache = Maps.newHashMap();
    private final Cache<String, Token> remoteCache = new RedisRemoteCacheManager();

    @Override
    public Optional<Token> get(String key) {
        final Token token = cache.get(key);

        if(token == null) return getFromRemote(key);

        return Optional.of(token);
    }

    @Override
    public void set(String key, Token value) {
        setOnRemote(key, value);
        cache.put(key, value);
    }

    private Optional<Token> getFromRemote(String key) {
        return remoteCache.get(key);
    }

    private void setOnRemote(String key, Token value) {
        remoteCache.set(key, value);
    }

}
