
package com.mycompany.pessoa;

public class TestePessoa {
    public static void main(String[] args) {
       
        Pessoa pessoa1 = new Pessoa("Ana Silva", 28, "123.456.789-00");

        
        Pessoa pessoa2 = new Pessoa();

        
        System.out.println("--- Dados Iniciais ---");
        System.out.println("Pessoa 1: " + pessoa1.Nome() + ", " + pessoa1.Idade() + " anos, CPF: " + pessoa1.Cpf());
        System.out.println("Pessoa 2: " + pessoa2.Nome() + ", " + pessoa2.Idade() + " anos, CPF: " + pessoa2.Cpf());

        
        pessoa2.alterarDados("Carlos Souza", 35, "987.654.321-11");

        
        System.out.println("\n--- Após Alteração da Pessoa 2 ---");
        System.out.println("Pessoa 2: " + pessoa2.Nome() + ", " + pessoa2.Idade() + " anos, CPF: " + pessoa2.Cpf());
    }
}
