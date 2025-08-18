public class EX5pt2 {
    public class Main {
    public static void main(String[] args) {
        // 1. Criando dois objetos da classe Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2018);

        // Mostrando informações originais dos dois carros
        System.out.println("=== Carro 1 ===");
        carro1.mostrarInformacoes();
        carro1.ligarCarro();

        System.out.println("\n=== Carro 2 ===");
        carro2.mostrarInformacoes();
        carro2.ligarCarro();

        // 2. Alterando os atributos do carro2
        carro2.setMarca("Ford");
        carro2.setModelo("Focus");
        carro2.setAno(2022);

        // 3. Mostrando os valores modificados na tela
        System.out.println("\n=== Carro 2 (Modificado) ===");
        carro2.mostrarInformacoes();

        // 4. Chamando os métodos novamente
        carro2.ligarCarro();
    }
}

}
