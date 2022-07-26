package org;

import io.undertow.Undertow;
import org.config.ServerConfig;
import org.handler.router.MainRouter;

public class App {

    public static void main(String ...args) {

        Undertow.builder()
                .addHttpListener(ServerConfig.port, ServerConfig.host)
                .setHandler(MainRouter.createRouter())
                .build()
                .start();

    }

}
