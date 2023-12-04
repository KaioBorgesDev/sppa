package com.example.demo.metodos;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Paineis {



    private void limparEPreencher(Pane pane) {
        // Limpa os componentes existentes
        pane.getChildren().clear();

        // Adiciona novos componentes
        Button novoBotao1 = new Button("Novo Botão 1");
        Button novoBotao2 = new Button("Novo Botão 2");

        pane.getChildren().addAll(novoBotao1, novoBotao2);
    }
}
