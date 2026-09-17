


package com.mycompany.pessoa;



    public class Pessoa {
    public static void main(String[] args) {
    
    
        String nome;
        int idade;
        String cpf;
    
    private String nome;
    private int idade;
    private String cpf;

   
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    
    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    
    public void alterarDados(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    
    public String Nome() {
        return nome;
    }

    public int Idade() {
        return idade;
    }

    public String Cpf() {
        return cpf;
    }
    }



