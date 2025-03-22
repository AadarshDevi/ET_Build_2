package main.java.controller;

import main.java.api.API;
import main.java.api.APIFactory;
import main.java.backend.logging.ConsoleLogger;
import main.java.backend.logging.LoggerFactory;

public class ParentController implements ParentControllerInterface {

    @SuppressWarnings("unused") private API api;
    private ConsoleLogger cl;

    public ParentController() {
        cl = LoggerFactory.getCl();
        connectAPI();
    }

    @Override
    public void connectAPI() {
        api = APIFactory.getApi();
        cl.log(this, "Connected to API");
    }

    @Override
    public void disconnectAPI() {
        api = null;
        cl.log("Disconnected from API");
    }
}
