public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Mouse Gamer";
        produto.preco = 159.9;
        produto.quantidade = 25;

        produto.exibirInformacoes();
    }
}
