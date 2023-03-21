public class Computador {
    String marca;
    float preco = 1;
    private SistemaOperacional sistema;
    HardwareBasico[] hardware =  new HardwareBasico[3];
    private MemoriaUSB musb;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    void mostraPCConfigs(){
        System.out.println("\nMarca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("\nHardwares básicos: ");
        System.out.println("\n" + hardware[0].nome);
        System.out.println("Capacidade: " + hardware[0].capacidade + " Mhz");
        System.out.println("\n" + hardware[1].nome);
        System.out.println("Capacidade: " + hardware[1].capacidade + "Gb");
        System.out.println("\n" + hardware[2].nome);
        System.out.println("Capacidade: " + hardware[2].capacidade + "Gb");
        System.out.println("\nSistema operacional: " + sistema.nome);
        System.out.println("Tipo do sistema: " + sistema.tipo + " bits");
        System.out.println("\nMemória USB: " + musb.nome + " de " + musb.capacidade + "Gb");
    }

    void addMemoriaUSB(MemoriaUSB novaMusb){
        musb = novaMusb;
    }

    public void setSistema(SistemaOperacional sistema) {
        this.sistema = sistema;
    }
}
