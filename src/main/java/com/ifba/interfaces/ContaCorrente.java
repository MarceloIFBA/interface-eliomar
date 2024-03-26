package com.ifba.interfaces;

public class ContaCorrente implements ContaInterface {
    String numero;
    double saldo;
    double limiteChequeEspecial;


    @Override
    public void sacar(double valor) {
        System.out.println("Sacando da corrente...");
        this.saldo = this.saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando na corrente...");
        this.saldo = this.saldo + valor;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
    
}
