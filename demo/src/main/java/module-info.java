module com.javahelloword {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javahelloword to javafx.fxml;
    exports com.javahelloword;
}
