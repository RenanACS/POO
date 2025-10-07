import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double calcularSubtotal() {
            return this.quantidade * this.precoUnitario;
        }
    }

    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nomeProduto, int quantidade, double preco) {
        ItemPedido novoItem = new ItemPedido(nomeProduto, quantidade, preco);
        this.itens.add(novoItem);
    }

    public double valorTotal() {
        double total = 0.0;
        for (ItemPedido item : this.itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}