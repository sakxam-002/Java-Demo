package project.slr.projects.layoutmanagers;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        FlowPane flowpane = new FlowPane();

        for (int i = 1; i<=10 ; i++) {
            Button button = new Button("Hello");
            flowpane.getChildren().add(button);
        }
        flowpane.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(flowpane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
