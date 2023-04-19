import ex.Cavaleiro;
import ex.Guarda;
import ex.Lorde;
import ex.Arma;
import ex.Montaria;
import ex.Pessoa;

public class Main {
    public static void main(String[] args) {

        Montaria m1 =  new Montaria();
        m1.setNome("alazão");

        Arma arma =  new Arma();
        arma.setTipo("lança");

        Guarda p1 = new Guarda("João", 24, 20, arma, 10);
        Cavaleiro p2 = new Cavaleiro("Gustavo", 27, 30, null, "Stark", "Lucas", m1);
        Lorde p3 = new Lorde("José", 34, 50, null, "Stark", 5);

        Pessoa [] pessoa = new Pessoa[3];
        pessoa[0] = p1;
        pessoa[1] = p2;
        pessoa[2] = p3;

        for(int i=0;i<pessoa.length;i++){
            if(pessoa[i] != null){
                if(pessoa[i] instanceof Guarda){
                    System.out.println("Função: guarda");
                    pessoa[i].orar();
                    ((Guarda) pessoa[i]).fazerPatrulha();
                }

                if(pessoa[i] instanceof Cavaleiro){
                    System.out.println("Função: cavaleiro");
                    ((Cavaleiro) pessoa[i]).consagraCavaleiro();
                    ((Cavaleiro) pessoa[i]).fazerPatrulha();
                    pessoa[i].orar();
                }

                if(pessoa[i] instanceof Lorde){
                    System.out.println("Função: lorde");
                    ((Lorde) pessoa[i]).consagraCavaleiro();
                    pessoa[i].orar();
                }

                pessoa[i].mostraInfo();

            }
        }

        System.out.println("\n\nQuantidade de pessoas: " + Pessoa.qtdPessoa);
    }
}