package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.FileInputStream;

public class ChatWindow extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chat.fxml"));
        stage.setScene(new Scene(root));

        // картинка в левом верхнем углу
        FileInputStream iconStream = new FileInputStream("C:\\Users\\Artyom Oganesyan\\eclipse-workspace\\JavaFXApp\\src\\sample\\icon.png");
        javafx.scene.image.Image image = new Image(iconStream);
        stage.getIcons().add(image);

        stage.setTitle("A-Chat - Анархический чат");

        stage.setMaximized(true);
        stage.setResizable(false);

        stage.show();
    }
}
