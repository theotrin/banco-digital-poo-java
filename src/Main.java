public class Main {
    public static void main(String[] args) {

        Conta contaAlfredo = new ContaCorrente("Alfredo");
        Conta contaAlberto = new ContaPoupanca("Alberto");

        contaAlfredo.depositar(10000);
        contaAlfredo.transferir(2000,contaAlberto);

        contaAlfredo.imprimirInformacoes();
        contaAlberto.imprimirInformacoes();

    }
}