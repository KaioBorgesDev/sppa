package com.example.demo.classes;

public abstract class Paciente {
    protected String nome;
    protected String telefone;
    protected String sexo;



    public Paciente(String nome, String telefone, String sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;

    }
    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nTelefone: " + telefone
                +"\nSexo: " + sexo
                +"\n********************\n";
        }

    public String getNome() {
        return nome;
    }
}

