package com.example.demo;

import com.example.demo.classes.Emagrecimento;
import com.example.demo.classes.Estetica;
import com.example.demo.classes.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.controlsfx.control.Notifications;


import java.util.HashSet;
import java.util.Set;

public class HelloController {
    @FXML
    Pane pane;
    Set<Paciente> pacientes = new HashSet<>();

    private Pane criarPainelEstetica() {
        pane.getChildren().clear();

        TextField nome = new TextField();
        nome.setLayoutX(47.0);
        nome.setLayoutY(112.0);

        TextField telefone = new TextField();
        telefone.setLayoutX(330.0);
        telefone.setLayoutY(112.0);

        TextField sexo = new TextField();
        sexo.setLayoutX(590.0);
        sexo.setLayoutY(112.0);

        ComboBox<String> tipoAtividade = new ComboBox<>();
        tipoAtividade.setLayoutX(47.0);
        tipoAtividade.setLayoutY(227.0);
        tipoAtividade.setPrefWidth(200.0);
        tipoAtividade.getItems().addAll("Realizando caminhada no bosque para emagrecimento.", "Realizando academia para emagrecimento.", "Realizando natacao para emagrecimento.");


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

        //metodo que cadastra

        button.setOnMouseClicked(e->{
            System.out.println(telefone.getText());
            if (!nome.getText().isEmpty() && !telefone.getText().isEmpty() && !sexo.getText().isEmpty()){
                String nomes = nome.getText();
                String telefones = telefone.getText();
                String sexos = sexo.getText();

                System.out.println(telefones);
                Paciente paciente = new Estetica(nomes,telefones,sexos);
                pacientes.add(paciente);
                mostrarNotificacao("Cadastradado com sucesso!","Paciente de Estetica cadastrado.");
            } else {
                mostrarNotificacao("Dados Incompletos","Há campos vazios.");
            }
        });

        pane.getChildren().addAll(
                nome, telefone, sexo, tipoAtividade,
                label1, label2, label3, label4, label5,
                button, comboBox
        );
        return pane;
    }

    private Pane criarPainelEmagrecimento() {

        pane.getChildren().clear();


        TextField nome = new TextField();
        nome.setLayoutX(47.0);
        nome.setLayoutY(112.0);

        ComboBox<String> tipoAtividade = new ComboBox<>();
        tipoAtividade.setLayoutX(47.0);
        tipoAtividade.setLayoutY(227.0);
        tipoAtividade.setPrefWidth(200.0);
        tipoAtividade.getItems().addAll("Realizando caminhada no bosque para emagrecimento.", "Realizando academia para emagrecimento.", "Realizando natacao para emagrecimento.");

        TextField telefone = new TextField();
        telefone.setLayoutX(330.0);
        telefone.setLayoutY(112.0);

        TextField peso = new TextField();
        peso.setLayoutX(47.0);
        peso.setLayoutY(227.0);

        TextField sexo = new TextField();
        sexo.setLayoutX(310.0);
        sexo.setLayoutY(227.0);

        TextField altura = new TextField();
        altura.setLayoutX(590.0);
        altura.setLayoutY(227.0);

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
            System.out.println(telefone.getText());
            if (!nome.getText().isEmpty() && !tipoAtividade.getValue().isEmpty() && !telefone.getText().isEmpty() && !peso.getText().isEmpty() && !sexo.getText().isEmpty() && !altura.getText().isEmpty()) {
                String nomes = nome.getText();
                String tipoatividade = tipoAtividade.getValue();
                String telefones = telefone.getText();
                double pesos = Double.parseDouble(peso.getText());
                String sexos = sexo.getText() ;
                double alturas = Double.parseDouble(altura.getText());

                Paciente paciente = new Emagrecimento(nomes,telefones,sexos,pesos,alturas);
                mostrarNotificacao("Cadastrado com sucesso!","Paciente de Emagrecimento cadastrado.");
            } else {
                mostrarNotificacao("Dados incompletos!", "Há campos vazios!");
            }



        });
        pane.getChildren().addAll(
                nome, telefone,
                peso, sexo, altura,
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

    }

    @FXML
    void jmiClose(ActionEvent event) {
        System.exit(0);
    }


    private void mostrarNotificacao(String titulo, String texto) {
        Notifications.create()
                .title(titulo)
                .text(texto)
                .show();
    }
}


