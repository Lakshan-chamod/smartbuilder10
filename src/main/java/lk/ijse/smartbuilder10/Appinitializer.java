package lk.ijse.smartbuilder10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.smartbuilder10.db.DBConnection;

import java.sql.Connection;

//public class Appinitializer extends Application {
//    public static void main(String[] args) {
//        launch(args);
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent parent = FXMLLoader.load(getClass().getResource("/view/LoginPage.fxml"));
//        Scene scene = new Scene(parent);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("SmartBuilder");
//        primaryStage.show();
//    }
//S}

public class Appinitializer {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            System.out.println("Connected to database");
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Connection failed");
        }
    }
}