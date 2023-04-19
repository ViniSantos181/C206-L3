package ex;

import ex.Pessoa;

public class Guarda extends Pessoa implements Patrulha{

    private int coragem;

    public Guarda(String nome, int idade, int honra, Arma arma, int coragem) {
        super(nome, idade, honra, arma);
        this.coragem = coragem;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
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

        System.out.println("Coragem: " + getCoragem());
    }

    public void orar(){
        System.out.println(getNome() + " fez uma oração aos deuses antigos");
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(getNome() + " fez uma patrulha além da muralha");
        coragem += 20;
    }
}
