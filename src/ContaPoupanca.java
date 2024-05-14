public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente) {
        super(cliente);
    }

    @Override
    protected void imprimirInformacoes() {
        System.out.println("Imprimindo informações conta Poupança");
        super.imprimirInformacoes();
    }
}
