package main.java.backend.main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.java.backend.api.API;
import main.java.backend.api.APIFactory;
import main.java.backend.logging.ConsoleLogger;
import main.java.backend.logging.LoggerFactory;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        API api = APIFactory.getApi();

    }

}