package main.java.backend.fxmlLoading;

import javafx.scene.layout.Pane;
import main.java.controller.ParentController;

public class FXMLPackage<T extends Pane, C extends ParentController> {

    private T pane;
    private C controller;

    public FXMLPackage(T pane, C controller) {
        this.pane = pane;
        this.controller = controller;
    }

    public T getPane() {
        return pane;
    }

    public C getController() {
        return controller;
    }

}
