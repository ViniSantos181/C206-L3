public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores = new Computador[50];

    float calculaTotalCompra(){
        float total=0;

        for(int  i = 0 ; i < computadores.length; i ++){
            if(computadores[i] != null) {
                total += computadores[i].preco;
            }
        }
        return total;
    }

    int cont = 0;

    void mostraInfo(){
        System.out.println("\nInformações do cliente: ");
        System.out.println("\nNome: " + nome);
        System.out.println("cpf: " + cpf);

       for(Computador computador : computadores){
           if(computador != null) {
               System.out.println("\nInformações do computador " + (cont+1) + ":");
               computadores[cont].mostraPCConfigs();
               cont++;
           }
       }
        System.out.println("\nPreço total: R$ " + calculaTotalCompra());
    }
}
