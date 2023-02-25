module com.example.labb_4iamtostupidtocode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labb_4iamtostupidtocode to javafx.fxml;
    exports com.example.labb_4iamtostupidtocode;
}