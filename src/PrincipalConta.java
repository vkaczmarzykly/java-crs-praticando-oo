public class PrincipalConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(1000.00);
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
