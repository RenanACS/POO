public class expooo3 {

    public class Aluno {
    
    private String nome;
    private int matricula;
    private double notaAv1;
    private double notaAv2;

    
    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

  
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("Média: " + calcularMedia());
    }

   
    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }

    
    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 4.0) {
            System.out.println("Situação: Prova Final");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

 
    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }
}
}