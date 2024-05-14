public class ContaCorrente extends Conta {
    public ContaCorrente(String cliente) {
        super(cliente);
    }

    @Override
    protected void imprimirInformacoes() {
        System.out.println("Imprimindo informações conta Corrente");
        super.imprimirInformacoes();
    }
}
