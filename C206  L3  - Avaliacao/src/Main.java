public class Main {
    public static void main(String[] args) {

        Faculdade faculdade1 = new Faculdade("Inatel", "15709376");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Carlos";
        aluno1.matricula = 405;
        aluno1.curso = "Eng. Software";

        Materia materia1 = new Materia("Programação orientada a objetos", "C206", 5);
        Materia materia2 = new Materia("Banco de dados", "C207", 4);
        Materia materia3 = new Materia("Matemática Discreta", "M020", 2);

        aluno1.materias[0] = materia1;
        aluno1.materias[1] = materia2;
        aluno1.materias[2] = materia3;

        aluno1.faculdade = faculdade1;

        //------------------------------------------

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Fernanda";
        aluno2.matricula = 1780;
        aluno2.curso = "Eng. Computação";

        Materia materia4 = new Materia("Matemática Básica", "M001", 3);
        Materia materia5 = new Materia("Banco de dados", "C207", 4);
        Materia materia6 = new Materia("Física 1", "F001", 6);

        aluno2.materias[0] = materia4;
        aluno2.materias[1] = materia5;
        aluno2.materias[2] = materia6;

        aluno2.faculdade = faculdade1;

        //-------------------------------------------

        System.out.println("\nInformações do primeiro aluno:");
        aluno1.exibirInfos();

        System.out.println("\n ---------------------------------------------------------");

        System.out.println("\nInformações do segundo aluno: \n");
        aluno2.exibirInfos();
    }
}