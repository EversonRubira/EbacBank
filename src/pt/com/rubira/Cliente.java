package pt.com.rubira;

//classe Cliente, herdando atributos da classe Conta

public class Cliente {
    private String nome;
    private Conta conta;

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Conta getConta() {
        return conta;
    }
    public String getNome() {
        return nome;
    }
    public Cliente(String nome) {
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
