package org.PooProject.Model;

public class User {
    private String nome;
    private String matricula;
    private String cpf;

    public User (String nome, String matricula, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
