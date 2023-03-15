public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cor = "Azul";
        carro1.marca = "VW";
        carro1.modelo = "Gol";
        carro1.velocidadeMax = 190;
        carro1.velocidadeAtual = 50;

        System.out.println("\nPrimeiro carro");

        carro1.mostraInfo();
        carro1.ligar();
        carro1.mostraInfo();
        carro1.acelerar();
        carro1.mostraInfo();

        carro2.cor = "Branco";
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.velocidadeMax = 170;
        carro2.velocidadeAtual = 60;

        System.out.println("\nSegundo carro");

        carro2.mostraInfo();
        carro2.ligar();
        carro2.mostraInfo();
        carro2.acelerar();
        carro2.mostraInfo();
    }
}