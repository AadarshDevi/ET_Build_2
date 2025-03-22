package main.java.backend.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.java.api.API;
import main.java.api.APIFactory;
import main.java.backend.fxmlLoading.FXMLFactory;
import main.java.backend.fxmlLoading.FXMLPackage;
import main.java.controller.uiController.MainframeController;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        @SuppressWarnings("unused")
        API api = APIFactory.getApi();

        FXMLPackage<BorderPane, MainframeController> mfPackage = FXMLFactory.getFxmlManager().getMainframe();
        BorderPane mf = mfPackage.getPane();
        MainframeController mfc = mfPackage.getController();
        mf.getProperties().put("controller", mfc);

        Scene scene = new Scene(mf);

        stage.setScene(scene);
        stage.setTitle("Entertainment Tracker");
        stage.setResizable(true);
        stage.centerOnScreen();
        stage.show();
    }
}