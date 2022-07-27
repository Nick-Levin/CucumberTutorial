package todoapp;

import io.undertow.Undertow;
import todoapp.config.ServerConfig;
import todoapp.handler.router.MainRouter;

public class App {

    public static void main(String ...args) {

        Undertow.builder()
                .addHttpListener(ServerConfig.PORT, ServerConfig.HOST)
                .setHandler(MainRouter.createRouter())
                .build()
                .start();

    }

}
