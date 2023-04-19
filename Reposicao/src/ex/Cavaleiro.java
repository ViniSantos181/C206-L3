package ex;

import ex.Pessoa;

public class Cavaleiro extends Pessoa implements Patrulha, Consagra{

    private String casa;
    private String nomeEscudeiro;
    private Montaria montaria;

    public Cavaleiro(String nome, int idade, int honra, Arma arma, String casa, String nomeEscudeiro, Montaria montaria) {
        super(nome, idade, honra, arma);
        this.casa = casa;
        this.nomeEscudeiro = nomeEscudeiro;
        this.montaria = montaria;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getNomeEscudeiro() {
        return nomeEscudeiro;
    }

    public void setNomeEscudeiro(String nomeEscudeiro) {
        this.nomeEscudeiro = nomeEscudeiro;
    }

    public Montaria getMontaria() {
        return montaria;
    }

    public void setMontaria(Montaria montaria) {
        this.montaria = montaria;
    }

    @Override
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

        System.out.println("Casa: " + getCasa());
        System.out.println("Nome do escudeiro: " + getNomeEscudeiro());
        System.out.println("Montaria: " + getMontaria().getNome());
    }

    public void orar(){
        System.out.println(getNome() + " fez uma oração o deus do fogo");
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(getNome() + " fez uma patrulha pelo reino");
    }

    @Override
    public void consagraCavaleiro() {
        System.out.println(getNome() + " consagrou um novo cavaleiro");
        setHonra(getHonra() + 5);
    }
}
