package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    Pane pane;


    private Pane criarPainelEstetica() {
        pane.getChildren().clear();

        TextField textField1 = new TextField();
        textField1.setLayoutX(47.0);
        textField1.setLayoutY(112.0);

        TextField textField2 = new TextField();
        textField2.setLayoutX(310.0);
        textField2.setLayoutY(112.0);

        TextField textField3 = new TextField();
        textField3.setLayoutX(590.0);
        textField3.setLayoutY(112.0);

        TextField textField4 = new TextField();
        textField4.setLayoutX(47.0);
        textField4.setLayoutY(227.0);

        Label label1 = new Label("Nome");
        label1.setLayoutX(107.0);
        label1.setLayoutY(89.0);

        Label label2 = new Label("Tipo Atividade");
        label2.setLayoutX(85.0);
        label2.setLayoutY(203.0);

        Label label3 = new Label("Telefone");
        label3.setLayoutX(368.0);
        label3.setLayoutY(89.0);

        Label label4 = new Label("Sexo");
        label4.setLayoutX(648.0);
        label4.setLayoutY(89.0);

        Label label5 = new Label("Quantidade Serviços");
        label5.setLayoutX(346.0);
        label5.setLayoutY(203.0);

        Button button = new Button("Cadastrar");
        button.setLayoutX(357.0);
        button.setLayoutY(371.0);

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.setLayoutX(325.0);
        comboBox.setLayoutY(227.0);
        comboBox.setPrefWidth(150.0);
        comboBox.getItems().addAll("1", "2", "3");

        button.setOnMouseClicked(e->{
            System.out.println("Ola Estetica");
        });

        pane.getChildren().addAll(
                textField1, textField2, textField3, textField4,
                label1, label2, label3, label4, label5,
                button, comboBox
        );
        return pane;
    }

    private Pane criarPainelEmagrecimento() {

        pane.getChildren().clear();


        TextField textField1 = new TextField();
        textField1.setLayoutX(47.0);
        textField1.setLayoutY(112.0);

        TextField textField2 = new TextField();
        textField2.setLayoutX(310.0);
        textField2.setLayoutY(112.0);

        TextField textField3 = new TextField();
        textField3.setLayoutX(590.0);
        textField3.setLayoutY(112.0);

        TextField textField4 = new TextField();
        textField4.setLayoutX(47.0);
        textField4.setLayoutY(227.0);

        TextField textField5 = new TextField();
        textField5.setLayoutX(310.0);
        textField5.setLayoutY(227.0);

        TextField textField6 = new TextField();
        textField6.setLayoutX(590.0);
        textField6.setLayoutY(227.0);

        Label label1 = new Label("Nome");
        label1.setLayoutX(107.0);
        label1.setLayoutY(89.0);

        Label label2 = new Label("Tipo Atividade");
        label2.setLayoutX(85.0);
        label2.setLayoutY(203.0);

        Label label3 = new Label("Telefone");
        label3.setLayoutX(368.0);
        label3.setLayoutY(89.0);

        Label label4 = new Label("Peso");
        label4.setLayoutX(378.0);
        label4.setLayoutY(203.0);

        Label label5 = new Label("Sexo");
        label5.setLayoutX(648.0);
        label5.setLayoutY(89.0);

        Label label6 = new Label("Altura");
        label6.setLayoutX(648.0);
        label6.setLayoutY(203.0);

        Button button = new Button("Cadastrar");
        button.setLayoutX(345.0);
        button.setLayoutY(368.0);


        button.setOnMouseClicked(e->{
            System.out.println("Ola");
        });
        pane.getChildren().addAll(
                textField1, textField2, textField3,
                textField4, textField5, textField6,
                label1, label2, label3, label4, label5, label6,
                button
        );
        return pane;


    }

    @FXML
    void jmiEmagrecimento(ActionEvent event) {
        criarPainelEmagrecimento();
    }

    @FXML
    void jmiEstetica(ActionEvent event) {
        criarPainelEstetica();
    }

    private void criarMostrar(){
        pane.getChildren().clear();

        TextArea textArea = new TextArea();
        textArea.setLayoutX(69.0);
        textArea.setLayoutY(74.0);
        textArea.setPrefHeight(372.0);
        textArea.setPrefWidth(679.0);

        Label label = new Label("Dados dos Clientes: ");
        label.setLayoutX(287.0);
        label.setLayoutY(14.0);
        label.setFont(new Font("Book Antiqua", 25.0));

        pane.getChildren().addAll(label,textArea);
    }
    @FXML
    void jmiMostrarEmagrecimento(ActionEvent event) {
        criarMostrar();
    }

    @FXML
    void jmiMostrarEstetica(ActionEvent event) {
        criarMostrar();
    }

    @FXML
    void jmiEditEmagrecimento(ActionEvent event) {

    }

    @FXML
    void jmiEditEstetica(ActionEvent event) {

    }
    @FXML
    void cadastrarCliente(MouseEvent event) {
        System.out.println("oi");
    }

    @FXML
    void jmiClose(ActionEvent event) {
        System.exit(0);
    }
}

