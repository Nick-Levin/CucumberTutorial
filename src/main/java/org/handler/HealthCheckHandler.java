package org.handler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;
import org.handler.model.HealthCheckResponse;

import java.util.UUID;

public class HealthCheckHandler implements HttpHandler {

    private final Gson gson = new GsonBuilder().create();

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "application/json");
        exchange.getResponseSender().send(
                gson.toJson(
                        HealthCheckResponse.builder()
                                .id(UUID.randomUUID())
                                .status("Alive")
                                .build()
                )
        );
    }

}
