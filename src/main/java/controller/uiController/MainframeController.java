package main.java.controller.uiController;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import main.java.backend.logging.ConsoleLogger;
import main.java.backend.logging.LoggerFactory;
import main.java.controller.ParentController;

public class MainframeController extends ParentController {

    @FXML private ComboBox<Label> search_bar_combobox;
    @FXML private TextField search_bar_textfield;

    @FXML private TabPane tabpane;

    @FXML private ListView<BorderPane> list_completed;
    @FXML private ListView<BorderPane> list_released;
    @FXML private ListView<BorderPane> list_upcoming;
    @FXML private ListView<BorderPane> list_search;

    @FXML private AnchorPane info_viewer_placeholder;

    @FXML private MenuItem app_close_menuitem;

    @FXML
    public void closeApp() {

        ConsoleLogger cl = LoggerFactory.getCl();
        cl.log(this, "Closing App");

        System.exit(0);
        // TODO: get window top do save and then exit
    }

}
