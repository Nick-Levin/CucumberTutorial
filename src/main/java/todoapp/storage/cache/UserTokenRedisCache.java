package todoapp.storage.cache;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Optional;

public class UserTokenRedisCache implements Cache<String, String> {

    private final Map<String, String> cache = Maps.newHashMap();
    private final Cache<String, String> remoteCache = new RedisRemoteCacheManager();

    @Override
    public Optional<String> get(String key) {
        final String token = cache.get(key);

        if(token == null) return getFromRemote(key);

        return Optional.of(token);
    }

    @Override
    public void set(String key, String value) {
        setOnRemote(key, value);
        cache.put(key, value);
    }

    private Optional<String> getFromRemote(String key) {
        return remoteCache.get(key);
    }

    private void setOnRemote(String key, String value) {
        remoteCache.set(key, value);
    }

}
