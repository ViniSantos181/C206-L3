public class Carrinho {

    double total;
    Produto[] produtos = new Produto[5];

    void mostraInfo(){
        for(int i = 0;i < produtos.length;i++){
            if( produtos[i]!=null ){
                System.out.println("\nInformações do produto " + i + ": ");
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Descrição: " + produtos[i].descricao);
                System.out.println("Fabricante: " + produtos[i].fabricante);
                System.out.println("Preço: " + produtos[i].preco);
            }
        }
    }

    double calculaTotal(){
        for(int i = 0;i < produtos.length;i++){
            if(produtos[i] != null)
                total += produtos[i].preco;
        }
        return total;
    }
}
