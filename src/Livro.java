public class Livro {
    String titulo;
    String autor;
    int paginas;

    public void exibirInformacoes() {
        System.out.printf("\"%s\" de %s com %s páginas", titulo, autor, paginas);
    }
}
