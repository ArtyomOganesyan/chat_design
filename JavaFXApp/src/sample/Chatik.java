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


public class Chatik extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("authorization.fxml"));
        primaryStage.setScene(new Scene(root));


        // картинка в левом верхнем углу
        FileInputStream iconStream = new FileInputStream("C:\\Users\\Artyom Oganesyan\\eclipse-workspace\\JavaFXApp\\src\\sample\\icon.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        // название вверху рядом с картинкой
        primaryStage.setTitle("A-Chat");

        // размеры нельзя менять
        primaryStage.setResizable(false);

        // устанавливаем начальное положение в центре
        primaryStage.setX(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 - 150);
        primaryStage.setY(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 - 100);

        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.show();
    }
}
