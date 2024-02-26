package com.grey.guipasswordgenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application
{
    @Override
    public void start(Stage mainWindow) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("main-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainWindow.setTitle("GUI Password Generator");
        mainWindow.setResizable(false);
        mainWindow.setScene(scene);
        mainWindow.centerOnScreen();
        mainWindow.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
