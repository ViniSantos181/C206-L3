package animais;

import animais.Animal;

public class Leao extends Animal {

    private float tamanhoJuba;

    public Leao(String nome, int idade, boolean perigoso, float tamanhoJuba) {
        super(nome, idade, perigoso);
        this.tamanhoJuba = tamanhoJuba;
    }

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
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

        System.out.println("Tamanho da juba: " + getTamanhoJuba());
    }

    public void dormir(){
        System.out.println("O leão está dormindo !");
    }

}
