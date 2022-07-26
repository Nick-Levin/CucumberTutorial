package org;

import io.undertow.Undertow;
import io.undertow.util.Headers;

public class App {

    public static void main(String ...args) {

        Undertow.builder()
                .addHttpListener(8000, "localhost")
                .setHandler(ex -> {
                    ex.getResponseHeaders().add(Headers.CONTENT_TYPE, "application/json");
                    ex.getResponseSender().send("{\"msg\":\"application alive\"}");
                })
                .build()
                .start();

    }

}
