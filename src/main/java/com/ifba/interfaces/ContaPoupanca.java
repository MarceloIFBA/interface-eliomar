package com.ifba.interfaces;

public class ContaPoupanca implements ContaInterface {
    String numero;
    double saldo;
    double juros;


    @Override
    public void sacar(double valor) {
        System.out.println("Sacando da Poupança...");
        this.saldo = this.saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando na Poupança...");
        this.saldo = this.saldo + valor;
    }

    @Override
    public double consultarSaldo() {
        return  this.saldo;
    }
    
}
