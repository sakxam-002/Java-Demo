package project.slr.projects.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StackPaneDemo extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {

        StackPane stackPane = new StackPane();

        Image image = new Image(StackPaneDemo.class.getResourceAsStream("/images/ironman.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(400);
        imageView.setFitWidth(400);
        stackPane.getChildren().add(imageView);

        Label label = new Label("Example of StackPane");
        label.setFont(Font.font("Qanor",20));
        label.setTextFill(Color.WHITE);
        Scene scene = new Scene(stackPane, 600 ,400);
        stage.setScene(scene);
        stage.show();
    }
}
