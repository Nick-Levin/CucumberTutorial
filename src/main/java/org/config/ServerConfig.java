package org.config;

import lombok.SneakyThrows;
import org.exceptions.config.CouldNotLoadFileException;

import java.io.IOException;
import java.util.Properties;

public class ServerConfig {

    private static final Properties props = new Properties();
    public static final Integer port;
    public static final String host;

    static {
        try {
            props.load(ClassLoader.getSystemClassLoader().getSystemResourceAsStream("server-conf.properties"));
            port = Integer.valueOf(props.getProperty("server.port"));
            host = props.getProperty("server.host");
        } catch (IOException e) {
            throw new CouldNotLoadFileException(e.getMessage());
        }
    }

}
