public class PedidoReabastecimento {
    private Fornecedor fornecedor;
    private Produto produto;
    private int quantidade;

    public PedidoReabastecimento(Fornecedor fornecedor, Produto produto, int quantidade) {
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

