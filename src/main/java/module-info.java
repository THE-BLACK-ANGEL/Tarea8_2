module com.example.tarea8_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.testfx;



    opens com.example.tarea8_2 to javafx.fxml;
    exports com.example.tarea8_2;
    exports com.example.tarea8_2.Controladores;
    opens com.example.tarea8_2.Controladores to javafx.fxml;
    exports com.example.tarea8_2.Modelos;

}