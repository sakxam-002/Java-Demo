package project.slr.projects.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class HBoxDemo extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox hbox = new HBox();

        for (int i = 1; i<=5 ; i++) {
            Button button = new Button("Hello" +i);
            hbox.getChildren().add(button);
        }
//        tilepane.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(hbox, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
