module com.example.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.javafxlogin to javafx.fxml;
    exports com.example.javafxlogin;
}