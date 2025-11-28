package Pessoa;

public class Main {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor();

        f1.setNome("Tech vendas");
        f1.setEndereco("Belem do Para");
        f1.setTelefone("919366583");
        

        f1.setvalorCredito(5000.00); 
        f1.setvalorDivida(1500.00);

        System.out.println("Nome do Fornecedor: " + f1.getNome());
        System.out.println("Telefone: " + f1.getTelefone());



        System.out.printf("Valor Crédito: R$ %.2f%n", f1.getvalorCredito());
        System.out.printf("Valor Dívida: R$ %.2f%n", f1.getvalorDivida());


        System.out.printf("Saldo Disponível (Crédito - Dívida): R$ %.2f%n", f1.obterSaldo());


        Fornecedor f2 = new Fornecedor("Alimentos SA", "Av. Brasil", "21 9999-9999", 10000, 2000);
        System.out.println("Fornecedor: " + f2.getNome());
        System.out.println("Saldo: R$ " + f2.obterSaldo());
    }
}
