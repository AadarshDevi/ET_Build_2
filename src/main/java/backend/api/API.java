package main.java.backend.api;

import main.java.backend.logging.ConsoleLogger;
import main.java.backend.logging.LoggerFactory;

public class API {

    public API() {
        System.out.println();

        ConsoleLogger cl = LoggerFactory.getCl();
        cl.log("logging");
        cl.log(this, "logging");
        cl.err(new Exception("This is an error"));
        cl.err(this, new Exception("This is an error"));
        cl.dbg("debugging code");
        cl.dbg(this, "debugging code");
    }

}
