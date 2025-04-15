module com.example.miniproject2csc265 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniproject2csc265 to javafx.fxml;
    exports com.example.miniproject2csc265;
}