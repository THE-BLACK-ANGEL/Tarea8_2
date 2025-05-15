package com.example.tarea8_2;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.robot.Robot;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.util.WaitForAsyncUtils;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class HelloApplicationTest extends ApplicationTest {

    @Override
    public void start(Stage stage) throws Exception {
        new HelloApplication().start(stage);
    }

    @BeforeEach
    void setUp() throws Exception {
        FxToolkit.registerPrimaryStage();
    }
/*
    @Test
    void testAddCompany() {
        FxRobot robot = new FxRobot();

        robot.clickOn("#tfNombre").write("Compañía Test");
        robot.clickOn("#btAnadir");

        robot.lookup(".dialog-pane");
        robot.clickOn(".text-field").write("234");
        robot.clickOn("Aceptar");

        WaitForAsyncUtils.waitForFxEvents();
        WaitForAsyncUtils.waitForFxEvents();

        Node secondDialogPane = robot.lookup(".dialog-pane").query();
        TextField secondTextField = robot.from(secondDialogPane).lookup(".text-field").query();

        robot.clickOn(secondTextField).write("345");

        robot.clickOn("Aceptar");

    }

 */
    @Test
    void testEditCompany() {
        FxRobot robot = new FxRobot();

        robot.clickOn("#tfNombre").write("Compañía Editar");
        robot.clickOn("#btAnadir");

        robot.lookup(".dialog-pane");
        robot.clickOn(".text-field").write("303");
        robot.clickOn("Aceptar");

        WaitForAsyncUtils.waitForFxEvents();

        WaitForAsyncUtils.waitForFxEvents();

        Node secondDialogPane = robot.lookup(".dialog-pane").query();
        TextField secondTextField = robot.from(secondDialogPane).lookup(".text-field").query();

        robot.clickOn(secondTextField).write("346");

        robot.clickOn("Aceptar");

        WaitForAsyncUtils.waitForFxEvents();
        TableView tableView = lookup("#tvDatos").query();
        Platform.runLater(() -> tableView.getSelectionModel().selectFirst());
        WaitForAsyncUtils.waitForFxEvents();

        robot.clickOn("#btnEditar");

        WaitForAsyncUtils.waitForFxEvents();
        Node dialogPaneName = robot.lookup(".dialog-pane").query();
        TextField tfName = robot.from(dialogPaneName).lookup(".text-field").query();
        robot.clickOn(tfName).eraseText(tfName.getText().length()).write("Compañia Editada");
        robot.clickOn("Aceptar");

        WaitForAsyncUtils.waitForFxEvents();
        Node dialogPanePartner = robot.lookup(".dialog-pane").query();
        TextField tfPartnerEdit = robot.from(dialogPanePartner).lookup(".text-field").query();
        robot.clickOn(tfPartnerEdit).eraseText(tfPartnerEdit.getText().length()).write("999");
        robot.clickOn("Aceptar");

        WaitForAsyncUtils.waitForFxEvents();
        Node dialogPaneCurrencyEdit = robot.lookup(".dialog-pane").query();
        TextField tfCurrencyEdit = robot.from(dialogPaneCurrencyEdit).lookup(".text-field").query();
        robot.clickOn(tfCurrencyEdit).eraseText(tfCurrencyEdit.getText().length()).write("888");
        robot.clickOn("Aceptar");

        WaitForAsyncUtils.waitForFxEvents();
        robot.clickOn("#btnBorrar").clickOn("#tfNombre").write("Compañia Editada");
        robot.sleep(5000);

    }



}
