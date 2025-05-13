package com.example.tarea8_2;

import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;
public class HelloApplicationTest extends ApplicationTest {
    @Override
    public void start(Stage stage) throws Exception {
        //Inicia la aplicación
        new HelloApplication().start(stage);
    }
    @Test
    public void shouldFindCompanyWhenSearchingWithYour() {
        // Simula la entrada de texto en el campo de búsqueda
        clickOn("#tfNombre").write("Your");
        sleep(5000);
    }
}
