public class ItemPedido {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String codigoProduto, String descricaoProduto, int quantidade, double precoUnitario) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}