package project.slr.projects.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();

        for (int i = 1; i<=5 ; i++) {
            Button button = new Button("Hello" +i);
            vbox.getChildren().add(button);
        }
//        tilepane.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(vbox, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
