package animais;

import animais.Animal;

public class Gato extends Animal implements Alimentacao {

    private String raca;

    public Gato(String nome, int idade, boolean perigoso, String raca) {
        super(nome, idade, perigoso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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

        System.out.println("A raça é: " + getRaca());
    }

    public void correr(){
        System.out.println("O agato está correndo !");
    }

    @Override
    public void comendo() {
        System.out.println("O gato está comendo !");
    }

}
