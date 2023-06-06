package ex1_2.ex2.Brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, int preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println(super.nome +" adicionando mais doce de leite!!");

    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de doce de leite sendo adicionado");
    }

}