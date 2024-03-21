package aulaexceptions;

import exceptions.SaldoInsufucienteException;

public class ContaBancaria {

    private int agencia;
    private int conta;
    private double saldo = 0;
    private double chequeEspecial = 0;

    public ContaBancaria(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void adicionarSaldo(double valor) {
        this.saldo = saldo + valor;
    }

    public void subtrairSaldo(double valor) throws Exception {
        if ((saldo + chequeEspecial) - valor < 0) {
            throw new Exception("CAUSA ORIGINAL: SALDO INSUFICIENTE");
        } else {
            this.saldo = saldo - valor;
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + '}';
    }
}
