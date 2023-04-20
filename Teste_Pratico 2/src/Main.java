import animais.Animal;
import animais.Zoo;
import animais.Gato;
import animais.Leao;
import animais.Coruja;
import animais.Alimentacao;

public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Leo", 12, true, 30);
        Coruja coruja = new Coruja("clara", 5, false, "branca");
        Gato gato = new Gato("teo", 3, false, "angorá");

        Zoo zoo = new Zoo();

        zoo.setNome("Floresta feliz");
        zoo.setEndereco("Pouso Alegre");
        zoo.setCnpj(1234567);
        zoo.animais[0] = leao;
        zoo.animais[1] = coruja;
        zoo.animais[2] = gato;

        zoo.mostraInfo();
    }
}