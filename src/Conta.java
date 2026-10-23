public class Conta {
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void exibirSaldo(){
        System.out.printf("Saldo atual: R$ %.2f%n\n", saldo);
    }

    public void zerarSaldo() {
        saldo = 0.0;
    }
}
