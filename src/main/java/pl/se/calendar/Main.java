package pl.se.calendar;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Admin on 2017-05-31.
 */
public class Main extends Application {

    public static final String FXML_BORDER_PANE_MAIN = "/fxml/BorderPaneMain.fxml";

    public static void main (String[] args)
    {
    launch(args);
    }

    public void start(Stage primaryStage) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(FXML_BORDER_PANE_MAIN)); // create FXMLLoader, get fxml file from folder resources
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("CalendarD");
        primaryStage.show();

        System.out.println("Hello world !");

    }
}
