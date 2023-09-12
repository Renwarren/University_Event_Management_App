module com.example.university_event_management_app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.university_event_management_app to javafx.fxml;
    exports com.example.university_event_management_app;
}