package View;
import Controller.Arquivo;
import Model.Professor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        Arquivo arq = new Arquivo();
        Professor prof = new Professor();

        System.out.println("Menu: ");
        System.out.println("Escolha a opção desejada: ");
        System.out.println("1 - Inserir um novo professor na lista");
        System.out.println("2 - Remover um professor da lista ");
        System.out.println("3 - Exibir a lista de professores ");
        System.out.println("4 - Sair ");

        try {
            op = entrada.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Entrada invalida, digite novamente a opção desejada: ");
            entrada.nextLine();
            op = entrada.nextInt();

        }
        entrada.nextLine();
        switch (op){
            case 1:
                System.out.println("Digite o nome do professor:");
                prof.nome = entrada.nextLine();
                System.out.println("Digite o cpf do professor:");
                prof.cpf = entrada.nextLine();
                System.out.println("Digite a materia do professor:");
                prof.materia = entrada.nextLine();

                arq.escrever(prof);
                break;
            case 2:
                System.out.println("Digite o nome do professor que deseja remover:");
                prof.nome = entrada.nextLine();
                System.out.println("Digite o cpf do professor que deseja remover:");
                prof.cpf = entrada.nextLine();
                System.out.println("Digite a materia do professor que deseja remover:");
                prof.materia = entrada.nextLine();

                arq.remover(prof);
                break;
            case 3:
                ArrayList<Professor> profs = arq.ler();
                for (int i=0; i< profs.size(); i++)
                {
                    System.out.println("Nome: " + profs.get(i).nome);
                    System.out.println("CPF: " + profs.get(i).cpf);
                    System.out.println( "Materia: "+ profs.get(i).materia);
                }
                break;
            case 4:
                System.out.println("Você saiu!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        entrada.close();
    }
}