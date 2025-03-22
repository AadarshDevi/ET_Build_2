package main.java.backend.fxmlLoading;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import main.java.backend.logging.ConsoleLogger;
import main.java.backend.logging.LoggerFactory;
import main.java.controller.ParentController;
import main.java.controller.uiController.MainframeController;

public class FXMLManager<T extends Pane, C extends ParentController> {

    private ConsoleLogger cl;

    // setting up logger
    public FXMLManager() {
        cl = LoggerFactory.getCl();
    }

    // reading fxmls
    public FXMLPackage<T, C> readFXML(String filepath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(filepath));
            T pane = loader.load();
            C controller = loader.getController();
            if (controller == null) {
                cl.err(this, new IOException("Controller is null"));
                System.exit(0);
            }
            return new FXMLPackage<T, C>(pane, controller);
        } catch (IOException e) {
            cl.err(e);
        }
        cl.err(this, new Exception("FXMLPackage is null!"));
        return null;
    }

    public FXMLPackage<BorderPane, MainframeController> getMainframe() {
        @SuppressWarnings("unchecked")
        FXMLPackage<BorderPane, MainframeController> mfPackage = (FXMLPackage<BorderPane, MainframeController>) readFXML(
                "../../../res/fxml/mainui/mainframe_b2_v1.fxml");
        return mfPackage;
    }

    public void getMovieViewer() {
    }

    public void getMovieModule() {
    }

    public void getEditor() {
    }

    public void getShowModule() {
    }

    public void getAnimeViewer() {
    }

}
