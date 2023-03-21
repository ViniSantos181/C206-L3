import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Carlos";
        cliente.cpf = 1856387205;

        Computador[] computadores = new Computador[3];
        //promoção 1:

        computadores[0] = new Computador("Positivo", 2300);
        SistemaOperacional sistema1 = new SistemaOperacional("Linux Ubuntu", 32);
        computadores[0].setSistema(sistema1);
        HardwareBasico hard01 = new HardwareBasico("Processador Core i3", 2200);
        HardwareBasico hard02 = new HardwareBasico("Memória RAM", 8);
        HardwareBasico hard03 = new HardwareBasico("HD", 500);
        computadores[0].hardware[0] = hard01;
        computadores[0].hardware[1] = hard02;
        computadores[0].hardware[2] = hard03;
        MemoriaUSB musb1 = new MemoriaUSB();
        musb1.nome = "Pen-drive";
        musb1.capacidade = 16;
        computadores[0].addMemoriaUSB(musb1);

        //promoção 2:
        computadores[1] = new Computador("Acer", 5800);
        SistemaOperacional sistema2 = new SistemaOperacional("Windows 8", 64);
        computadores[1].setSistema(sistema2);
        HardwareBasico hard11 = new HardwareBasico("Processador Core i5", 3370);
        HardwareBasico hard12 = new HardwareBasico("Memória RAM", 16);
        HardwareBasico hard13 = new HardwareBasico("HD", 1000);
        computadores[1].hardware[0] = hard11;
        computadores[1].hardware[1] = hard12;
        computadores[1].hardware[2] = hard13;
        MemoriaUSB musb2 = new MemoriaUSB();
        musb2.nome = "Pen-drive";
        musb2.capacidade = 32;
        computadores[1].addMemoriaUSB(musb2);

        //promoção 3:
        computadores[2] = new Computador("Vaio", 1800);
        SistemaOperacional sistema3 = new SistemaOperacional("Windows 10", 64);
        computadores[2].setSistema(sistema3);
        HardwareBasico hard21 = new HardwareBasico("Processador Core i7", 4500);
        HardwareBasico hard22 = new HardwareBasico("Memória RAM", 32);
        HardwareBasico hard23 = new HardwareBasico("HD", 2000);
        computadores[2].hardware[0] = hard21;
        computadores[2].hardware[1] = hard22;
        computadores[2].hardware[2] = hard23;
        MemoriaUSB musb3 = new MemoriaUSB();
        musb3.nome = "HD";
        musb3.capacidade = 1000;
        computadores[2].addMemoriaUSB(musb3);

        System.out.println("\nQual a promoção desejada ?: ");
        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        int x1 = entrada.nextInt();

        while(x1 != 0){

            switch(x1){

                case(1):
                    cliente.computadores[cont] = computadores[0];
                    break;
                case(2):
                    cliente.computadores[cont] = computadores[1];
                    break;
                case(3):
                    cliente.computadores[cont] = computadores[2];
                    break;
            }
            cont++;
            System.out.println("Deseja mais alguma promoção ?: ");
            x1 = entrada.nextInt();
        }
        cliente.mostraInfo();
    }
}