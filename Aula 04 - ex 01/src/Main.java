import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho1 = new Carrinho();

        carrinho1.produtos[0] = new Produto();

        carrinho1.produtos[0].nome = "Suco";
        carrinho1.produtos[0].descricao = "Suco de uva";
        carrinho1.produtos[0].fabricante = "Dell Vale";
        carrinho1.produtos[0].preco = 5;

        carrinho1.produtos[1] = new Produto();

        carrinho1.produtos[1].nome = "Refrigerante";
        carrinho1.produtos[1].descricao = "Refrigerante sabor laranja";
        carrinho1.produtos[1].fabricante = "Fanta";
        carrinho1.produtos[1].preco = 8;

        carrinho1.mostraInfo();

        double preco = carrinho1.calculaTotal();

        System.out.println("\nValor total: R$ " + preco);
    }
}