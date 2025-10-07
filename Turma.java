public class Turma {
    String codigo;
    Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        System.out.println("--- Resumo da Turma ---");
        System.out.println("Código da Turma: " + this.codigo);
        if (this.professor != null) {
            System.out.println("Professor: " + this.professor.nome);
        } else {
            System.out.println("Professor: (Não alocado)");
        }
        System.out.println("-----------------------");
    }
}