package org.gfg.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebServerDemo {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 9090), 0);
        server.createContext("/hello", new HelloHandler());
        server.start();
    }
}
