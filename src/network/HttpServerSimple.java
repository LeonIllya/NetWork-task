package network;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class HttpServerSimple {

    private HttpServer httpServer;

    public HttpServerSimple(int port, String context, HttpRequestHandler httpRequestHandler) {

        try {

            httpServer = HttpServer.create(new InetSocketAddress(port), 0);
            httpServer.createContext(context, httpRequestHandler);
            httpServer.setExecutor(null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        this.httpServer.start();
    }
}
