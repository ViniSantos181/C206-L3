package animais;

public abstract class Animal {

    public static int qntAnimais;
    private String nome;
    private int idade;
    private boolean perigoso = false;

    public Animal(String nome, int idade, boolean perigoso) {
        this.nome = nome;
        this.idade = idade;
        this.perigoso = perigoso;
    }

    public static int getQntAnimais() {
        return qntAnimais;
    }

    public static void setQntAnimais(int qntAnimais) {
        Animal.qntAnimais = qntAnimais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    public void mostraInfo(){
        System.out.println("Nome do animal: " + getNome());
        System.out.println("Idade do animal: " + getIdade());
        if(isPerigoso() == true)
            System.out.println("O animal é perigoso !");

        else
            System.out.println("O animal não é perigoso !");

        qntAnimais++;
    }

    public String barulho(){
        String som = "O animal está fazendo barulho ";

        return som;
    }

}
