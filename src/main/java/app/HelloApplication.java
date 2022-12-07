package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Estrutura de dados - Home");
        stage.setScene(scene);
        stage.show();

        Image image = new Image(getClass().getResource("assets/icon.png").toURI().toString());
        stage.getIcons().add(image);
    }

    public static void main(String[] args) {
        launch();
    }
}