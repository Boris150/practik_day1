module com.example.demoup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoup to javafx.fxml;
    exports com.example.demoup;
}