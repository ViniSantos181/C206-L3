public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor1;

    void ligar(){
        System.out.println("\nLigando o carro");
    }

    void acelerar(){
        velocidadeAtual += 10;
    }

    void mostraInfo() {
        System.out.println("\nA cor do carro é: " + cor);
        System.out.println("\nA marca do carro é: " + marca);
        System.out.println("\nO modelo do carro é: " + modelo);
        System.out.println("\nA velocidade máxima do carro é: " + velocidadeMax);
        System.out.println("\nA velocidade atual do carro é: " + velocidadeAtual);
    }
}
