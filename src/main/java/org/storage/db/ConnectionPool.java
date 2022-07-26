package org.storage.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {

    public static final HikariConfig config = new HikariConfig();
    public static final HikariDataSource ds;

    private ConnectionPool() {}

    static {
        config.setJdbcUrl("mysql://localhost:3306/tododb");
        config.setUsername("todoapp");
        config.setPassword("todoapppass");
        config.addDataSourceProperty("cachePrepStmts" , "true");
        config.addDataSourceProperty("prepStmtCacheSize" , "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit" , "2048");
        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
