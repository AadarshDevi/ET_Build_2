package main.java.backend.logging;

public interface LoggerInterface {

    void log(String string); // logging

    void err(Exception e); // error

    void dbg(String string); // debugging

}
