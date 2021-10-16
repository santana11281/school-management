module com.example.schoolmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires lombok;

    opens com.example.schoolmanagement to javafx.fxml;
    exports com.example.schoolmanagement;
    exports com.example.schoolmanagement.Database;
    opens com.example.schoolmanagement.Database to javafx.fxml;
}