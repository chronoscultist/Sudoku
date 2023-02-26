module com.example.labb_4iamtostupidtocode {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.labb_4iamtostupidtocode to javafx.fxml;
    exports com.example.labb_4iamtostupidtocode;
}