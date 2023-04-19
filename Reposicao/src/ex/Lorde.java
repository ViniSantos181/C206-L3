package ex;

import ex.Pessoa;

public class Lorde extends Pessoa implements Consagra{

    private String casa;
    private int qtdVassalos;

    public Lorde(String nome, int idade, int honra, Arma arma, String casa, int qtdVassalos) {
        super(nome, idade, honra, arma);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getQtdVassalos() {
        return qtdVassalos;
    }

    public void setQtdVassalos(int qtdVassalos) {
        this.qtdVassalos = qtdVassalos;
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
        System.out.println("Quantidade de vassalos: " + getQtdVassalos());
    }

    public void orar(){
        System.out.println(getNome() + " fez uma oração aos sete deuses");
    }

    @Override
    public void consagraCavaleiro() {
        System.out.println(getNome() + " consagrou um novo cavaleiro");
        qtdVassalos++;
    }
}
