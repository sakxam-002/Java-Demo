package project.slr.projects.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridpane = new GridPane();

//        for (int i = 1; i<=30 ; i++) {
//        }
//        gridpane.setOrientation(Orientation.VERTICAL);
        Button button1 = new Button("Hello 1");
        Button button2 = new Button("Hello 2");
        Button button3 = new Button("Hello 3");
        Button button4 = new Button("Hello 4");
        Button button5 = new Button("Hello 5");


        gridpane.add(button1, 0 ,0, 2,2);
        gridpane.add(button2, 2 ,1, 1,1);
        gridpane.add(button3, 2 ,0, 1,1);
        gridpane.add(button4, 3 ,1, 1,1);
        gridpane.add(button5, 3 ,0, 1,1);

        gridpane.setHgap(5);
        gridpane.setVgap(5);

        Scene scene = new Scene(gridpane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
