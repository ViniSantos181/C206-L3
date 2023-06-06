package View;

import Controller.Arquivo;
import Model.Estagiario;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();
        Estagiario est = new Estagiario();
        int X;

        System.out.println("Opções:");
        System.out.println("1: Inserir um novo estagiario na lista");
        System.out.println("2: Remover um estagiario da lista");
        System.out.println("3: Exibir a lista de estagiarios");
        System.out.println("4: Sair");

        try{
            X = entrada.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Entrada inválida! digite novamente a opção: ");
            entrada.nextLine();
            X = entrada.nextInt();
        }

        entrada.nextLine();

        switch(X){

            case 1:
                System.out.println("Digite o nome do estagiario:");
                est.nome = entrada.nextLine();
                System.out.println("Digite o cpf do estagiario:");
                est.cpf = Long.parseLong(entrada.nextLine());
                System.out.println("Digite o salário do estagiario:");
                est.salario = Float.parseFloat(entrada.nextLine());
                arquivo.escrever(est);

                break;

            case 2:
                System.out.println("Digite o nome do estagiario que deseja remover:");
                est.nome = entrada.nextLine();
                System.out.println("Digite o cpf do estagiario que deseja remover:");
                est.cpf = Long.parseLong(entrada.nextLine());
                System.out.println("Digite o salário do estagiario que deseja remover:");
                est.salario = Float.parseFloat(entrada.nextLine());
                arquivo.remover(est);

                break;

            case 3:
                ArrayList<Estagiario> ests = arquivo.ler();

                for(int i=0; i< ests.size(); i++){
                    System.out.println("Nome: " + ests.get(i).nome);
                    System.out.println("CPF: " + ests.get(i).cpf);
                    System.out.println( "Salário: "+ ests.get(i).salario);
                }

                break;

            case 4:
                System.out.println("Saída do programa");

                break;

            default:
                System.out.println("Opção inválida");

                break;
        }
        entrada.close();
    }
}