package project.slr.projects.layoutmanagers;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneDemo extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        TilePane tilepane = new TilePane();

        for (int i = 1; i<=30 ; i++) {
            Button button = new Button("Hello" +i);
            tilepane.getChildren().add(button);
        }
//        tilepane.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(tilepane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
