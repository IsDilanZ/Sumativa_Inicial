module com.example.ejercicio_escalera {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio_escalera to javafx.fxml;
    exports com.example.ejercicio_escalera;
}