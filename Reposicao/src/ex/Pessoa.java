package ex;

public abstract class Pessoa {

    public static int qtdPessoa;
    private String nome;
    private int idade;
    private int honra;
    private Arma arma;

    public Pessoa(String nome, int idade, int honra, Arma arma) {
        this.nome = nome;
        this.idade = idade;
        this.honra = honra;
        this.arma = arma;
    }

    public int getQtdPessoa() {
        return qtdPessoa;
    }

    public void setQtdPessoa(int qtdPessoa) {
        this.qtdPessoa = qtdPessoa;
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

    public int getHonra() {
        return honra;
    }

    public void setHonra(int honra) {
        this.honra = honra;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void mostraInfo(){
        System.out.println("Quantidade de pessoas: " + getQtdPessoa());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Honra: " + getHonra());

        if(getArma().getTipo() != null){
            System.out.println("Possui uma arma !");
            System.out.println("Arma: " + getArma().getTipo());
        }
        else
            System.out.println("Não possui uma arma !");
    }

    public void orar() {
    }
}
