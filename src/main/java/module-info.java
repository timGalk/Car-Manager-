module com.example.carmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.apache.pdfbox;
    requires com.fasterxml.jackson.databind;
    requires itextpdf;


    opens com.example.carmanager to javafx.fxml, com.google.gson;
    exports com.example.carmanager;

}