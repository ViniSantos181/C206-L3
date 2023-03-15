public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo(){
        System.out.println("\nO código de série é: " + codigoSerie);
        System.out.println("\nO código do produto é: " + codigoProduto);
        System.out.println("\nO nome do produto é: " + nome);
        System.out.println("\nA categoria do produto é: " + categoria);
        System.out.println("\nA quantidade do produto é: " + quantidade);
    }
}
