package main.java.api;

import main.java.backend.logging.ConsoleLogger;
import main.java.backend.logging.LoggerFactory;

public class API {

    private ConsoleLogger cl;

    public API() {
        cl = LoggerFactory.getCl();
    }
}
