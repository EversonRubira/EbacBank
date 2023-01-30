package pt.com.rubira;

// classe conta com seus atributos private

public class Conta {

    private int numeroConta;
    private int agencia;
    private double saldo;
    private String titular;
    private Cliente cliente;


    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void numeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void agencia(int agencia) {
        this.agencia = agencia;
    }
    public void saldo(double saldo) {
        this.saldo = saldo;
    }
    public void titular(String titular) {
        this.titular = titular;
    }



}
