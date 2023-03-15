public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.codigoSerie = 23;
        produto1.codigoProduto = "57";
        produto1.nome = "Chocolate";
        produto1.categoria = "Doces";
        produto1.quantidade = 240;

        System.out.println("\nAs informações do primeiro produto são:");
        produto1.mostraInfo();

        produto2.codigoSerie = 54;
        produto2.codigoProduto = "67";
        produto2.nome = "Maçã";
        produto2.categoria = "Frutas";
        produto2.quantidade = 500;

        System.out.println("\nAs informações do segundo produto são:");
        produto2.mostraInfo();
    }
}