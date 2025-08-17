public class livro {
    // Atributos
    String titulo;
    String autor;
    double preco;

    // Método para cadastrar
    void cadastrar() {
        System.out.println("Livro cadastrado: " + titulo);
    }

    // Método para calcular frete
    double calcFrete(String cep) {
        if (cep.startsWith("66")) {
            return 12.50;
        } else {
            return 20.00;
        }
    }

    // Método para imprimir dados
    void imprimirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }

   
    public static void main(String[] args) {
      
        livro livro1 = new livro();

        // Atribuindo valores
        livro1.titulo = "O Hobbit";
        livro1.autor = "J.R.R. Tolkien";
        livro1.preco = 39.90;

        // Usando os métodos
        livro1.cadastrar();
        livro1.imprimirDados();
        double frete = livro1.calcFrete("66000-000");
        System.out.printf("Frete: R$ %.2f%n", frete);
    }
}
