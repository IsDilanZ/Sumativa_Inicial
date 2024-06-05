module com.example.sumativa_inicial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumativa_inicial to javafx.fxml;
    exports com.example.sumativa_inicial;
}