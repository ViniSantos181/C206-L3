package ex1_2.ex2.Brownie;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, int preco, String sabor) {
        super(nome,preco,sabor);
    }

    public void adicionaNutella() {

        System.out.println(super.nome +" adicionando mais nutella");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de nutella sendo adicionado");
    }


}