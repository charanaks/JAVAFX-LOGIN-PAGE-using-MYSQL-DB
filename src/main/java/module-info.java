module com.example.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxlogin to javafx.fxml;
    exports com.example.javafxlogin;
}