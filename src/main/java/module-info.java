module lk.ijse.smartbuilder10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens lk.ijse.smartbuilder10 to javafx.fxml;
    opens lk.ijse.smartbuilder10.Controller to javafx.fxml;
    exports lk.ijse.smartbuilder10;
}