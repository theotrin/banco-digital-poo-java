import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected  int agencia;
    protected  int conta;
    protected  int banco;
    protected  double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    public Conta(String nome) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = (int)Math.floor(Math.random() * (999999999 - 0 + 1) + 0);
        this.banco = banco;
        this.saldo = saldo;
        this.cliente = new Cliente(nome);
    }

    public void sacar(double valor) {
        this.saldo -=valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    protected void imprimirInformacoes() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
