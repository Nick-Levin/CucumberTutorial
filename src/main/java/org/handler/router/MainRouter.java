package org.handler.router;

import io.undertow.server.HttpHandler;
import io.undertow.server.RoutingHandler;
import io.undertow.util.Methods;
import org.handler.HealthCheckHandler;

public class MainRouter {

    private static final String BASE_URL = "/api/v1";

    private MainRouter() {}

    public static HttpHandler createRouter() {
        return new RoutingHandler()
                .add(Methods.GET, BASE_URL + "/health", new HealthCheckHandler());
    }

}
