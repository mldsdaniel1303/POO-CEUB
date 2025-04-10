import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private String id;
    private Date dataHora;
    private StatusPedido status;
    private Vendedor Vendedor;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(String id, Date dataHora, StatusPedido status, Vendedor vendedor, Cliente cliente) {
        this.id;
        this.dataHora = dataHora;
        this.status = status;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    public double calcularValorTotal() {
        double total = 0;
        fot(ItemPedido item : itens) {
            total += item.calcularSubtotal();
            
        }
        return total;
    }
    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }
    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }
    public void removerItem(String codigoProduto) {
        itens.removeIfitem -> item.getPrecoUnitario() * (1 - percentual / 100);
        item.setPrecoUnitario(novoPreco);
    }
}
