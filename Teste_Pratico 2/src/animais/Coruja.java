package animais;

import animais.Animal;

public class Coruja extends Animal implements Alimentacao{

    private String cor;

    public Coruja(String nome, int idade, boolean perigoso, String cor) {
        super(nome, idade, perigoso);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Nome do animal: " + getNome());
        System.out.println("Idade do animal: " + getIdade());
        if(isPerigoso() == true)
            System.out.println("O animal é perigoso !");

        else
            System.out.println("O animal não é perigoso !");

        qntAnimais++;

        System.out.println("A cor é: " + getCor());
    }


    public void voar(){
        System.out.println("A coruja está voando !");
    }

    @Override
    public void comendo() {
        System.out.println("A coruja está comendo !");
    }
}
