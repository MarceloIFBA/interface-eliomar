package com.ifba.interfaces;

public class App {
    public static void main(String[] args) {
        ContaInterface corrente = new ContaCorrente();
        corrente.depositar(100);
        System.out.println("Saldo Atual: " + corrente.consultarSaldo());


        
        ContaInterface poupanca = new ContaPoupanca();
        poupanca.depositar(50);
        System.out.println("Saldo Atual: " + poupanca.consultarSaldo());
    }
    
}
