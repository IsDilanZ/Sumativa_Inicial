module com.example.robotmoving {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.robotmoving to javafx.fxml;
    exports com.example.robotmoving;
}