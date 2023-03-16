public class Restaurante {
    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedores = new Fornecedor[4];

    void exibirInfos(){
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Nome: " + nome);

        for(int i = 0;i < fornecedores.length;i++){
            if(fornecedores[i] != null){
                System.out.println("\nInformações do fornecedor " + i + ": ");
                System.out.println("Tipo: " + fornecedores[i].tipo);
                System.out.println("Quantidade: " + fornecedores[i].quantidade);
            }
        }
    }
}
