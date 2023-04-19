import ex1.Hatch;
import ex1.SUV;
import ex1.Sedan;

public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan();
        sedan.setAno(2015);
        sedan.setCor("preto");
        sedan.setValor(70000);
        sedan.setPortaMalas(4);

        sedan.taxa();
        System.out.println();
        sedan.mostraInfo();
        System.out.println();

        SUV suv = new SUV();
        suv.setAno(2012);
        suv.setCor("prata");
        suv.setValor(100000);
        suv.setTracao("20");

        suv.taxa();
        System.out.println();
        suv.mostraInfo();
        System.out.println();

        Hatch hatch = new Hatch();
        hatch.setAno(20010);
        hatch.setCor("vermelho");
        hatch.setValor(80000);
        hatch.setPortas(2);

        hatch.taxa();
        System.out.println();
        hatch.mostraInfo();
        System.out.println();
    }
}