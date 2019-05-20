package Conta;

public abstract class Count {
    protected double saldo;

    public Count(double saldo) {

        this.saldo = saldo;
    }

    public abstract void imprimeExtrato();
}
