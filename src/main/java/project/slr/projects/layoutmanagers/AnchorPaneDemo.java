package project.slr.projects.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneDemo extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane anchorpane = new AnchorPane();

        TextArea textArea = new TextArea();
        Button button = new Button("Submit");


        anchorpane.getChildren().addAll(textArea,button);

        AnchorPane.setTopAnchor(textArea, 10.0);
        AnchorPane.setRightAnchor(button, 10.0);
        AnchorPane.setTopAnchor(button, 10.0);

        Scene scene = new Scene(anchorpane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
