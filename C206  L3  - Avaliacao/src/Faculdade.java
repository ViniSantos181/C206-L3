public class Faculdade {
    String nome;
    String cnpj;

    void exbirInfos(){
        System.out.println("\nNome da faculdade: " + nome);
        System.out.println("CNPJ da faculdade: " + cnpj);
    }

    public Faculdade(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
