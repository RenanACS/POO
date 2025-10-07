public class PedidoMain {
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido();

        meuPedido.adicionarItem("Teclado Mecânico", 2, 150.00);
        meuPedido.adicionarItem("Mouse Gamer", 1, 80.50);
        meuPedido.adicionarItem("Monitor 24 polegadas", 1, 750.00);

        double total = meuPedido.valorTotal();

        System.out.println("O valor total do pedido é: R$ " + String.format("%.2f", total));
    }
}