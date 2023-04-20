package animais;

public class Zoo {

    private String nome;
    private String endereco;
    private long cnpj;
    public Animal [] animais = new Animal[50];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public void mostraInfo(){
        System.out.println("O nome do zoológico é: " + getNome());
        System.out.println("O endereço é: " + getEndereco());
        System.out.println("O CNPJ é: " + getCnpj());
        System.out.println("Animais do zoológico: ");
        for(int i = 0;i < animais.length;i++){

            if(animais[i] != null){

                System.out.println("----------------------------");

                if(animais[i] instanceof Leao){
                    System.out.println("Animal: Leão");
                    ((Leao) animais[i]).dormir();
                }

                if(animais[i] instanceof Coruja){
                    System.out.println("Animal: Coruja");
                    ((Coruja) animais[i]).voar();
                    ((Coruja) animais[i]).comendo();
                }

                if(animais[i] instanceof Gato){
                    System.out.println("Animal: Gato");
                    ((Gato) animais[i]).correr();
                    ((Gato) animais[i]).comendo();
                }

                System.out.println(animais[i].barulho());

                animais[i].mostraInfo();
            }
        }

        System.out.println("----------------------------");
        System.out.println("Quantidade de animais: " + Animal.qntAnimais);
    }
}
