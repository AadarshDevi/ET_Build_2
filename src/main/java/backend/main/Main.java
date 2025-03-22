package main.java.backend.main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.java.backend.logging.ConsoleLogger;
import main.java.backend.logging.LoggerFactory;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

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