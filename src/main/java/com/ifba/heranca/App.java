package com.ifba.heranca;

public class App {
    public static void main(String[] args) {
        Pessoa a = new Aluno();
        a.nomePrincipal = "Hermione";
        a.sobrenome = "Granger";
        // a.matricula = "202312309";
        a.cpf = "134.556.789.76";

        System.out.println(a);

        a = new Professor();
        a.nomePrincipal = "Galileo";


        System.out.println(a);


        System.out.println("Nome Pessoa: " + a.nomePrincipal);
        System.out.println("Nome do Aluno: " + a.nomePrincipal);
        System.out.println("Sobrenome: " + a.sobrenome);
        // System.out.println("Matrícula: " + a.matricula);
        System.out.println("CPF: " + a.cpf);


        System.out.println("Instância de Aluno: " + (a instanceof Aluno));
        System.out.println("Instância de Professor: " + (a instanceof Professor));

    }
    
}
