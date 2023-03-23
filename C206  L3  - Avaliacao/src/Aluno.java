public class Aluno {
    String nome;
    int matricula;
    String curso;
    Materia[] materias = new Materia[50];
    Faculdade faculdade;

    int totalCreditos(){
        int total=0;

        for(int i = 0;i < materias.length; i++) {
            if(materias[i] != null) {
                total = total + materias[i].creditos;
            }
        }

        return total;
    }

    void exibirInfos() {

        System.out.println("\nNome do aluno: " + nome);
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Curso do aluno: " + curso);

        System.out.println("\nMatérias do aluno:");

        for (int i = 0; i < materias.length; i++)
            if (materias[i] != null) {
                System.out.println("\nNome da matéria: " + materias[i].nome);
                System.out.println("Sigla da matéria: " + materias[i].sigla);
                System.out.println("Créditos da matéria: " + materias[i].creditos);
            }

        faculdade.exbirInfos();
        System.out.println("\nTotal de créditos do aluno: " + totalCreditos());
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }
}
