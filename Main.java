
public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("João Silva");
        Professor prof2 = new Professor("Maria Oliveira");
        Turma turma = new Turma("TSI01");

        turma.setProfessor(prof1);
        turma.resumo();

        System.out.println("\n...Trocando o professor da turma...\n");
        turma.setProfessor(prof2);
        turma.resumo();
    }
}