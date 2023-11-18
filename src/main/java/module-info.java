module com.example.resumebuilderdone {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires itextpdf;
    requires java.desktop;

    opens com.example.resumebuilderdone to javafx.fxml;
    exports com.example.resumebuilderdone;
}