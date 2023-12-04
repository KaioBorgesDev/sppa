package com.example.demo.classes;


import com.example.demo.interfaces.Atividades;

public class Estetica extends Paciente implements Atividades {

    public Estetica(String nome, String telefone, String sexo, String tipoAtividade) {
        super(nome, telefone, sexo, tipoAtividade);
    }

    @Override
    public String toString() {
        return "Estetica: " +super.toString();
    }



    @Override
    public String caminharBosque() {
        return null;
    }

    @Override
    public String nadarPiscina() {
        return null;
    }

    @Override
    public String exercitarAcademia() {
        return null;
    }
}
