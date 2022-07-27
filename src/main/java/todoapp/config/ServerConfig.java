package todoapp.config;

import todoapp.exceptions.config.CouldNotLoadFileException;

import java.io.IOException;
import java.util.Properties;

public class ServerConfig {

    private static final Properties props = new Properties();
    public static final Integer PORT;
    public static final String HOST;

    private ServerConfig() {}

    static {
        try {
            props.load(ClassLoader.getSystemResourceAsStream("server-conf.properties"));
            PORT = Integer.valueOf(props.getProperty("server.port"));
            HOST = props.getProperty("server.host");
        } catch (IOException e) {
            throw new CouldNotLoadFileException(e.getMessage());
        }
    }

}
