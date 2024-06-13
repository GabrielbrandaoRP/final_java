import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    private List<Fornecedor> fornecedores;
    private List<PedidoReabastecimento> pedidos;

    public Estoque() {
        this.produtos = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void registrarEntrada(String codigoProduto, int quantidade) {
        Produto produto = encontrarProdutoPorCodigo(codigoProduto);
        if (produto != null) {
            produto.addEstoque(quantidade);
        }
    }

    public void registrarSaida(String codigoProduto, int quantidade) {
        Produto produto = encontrarProdutoPorCodigo(codigoProduto);
        if (produto != null) {
            produto.removeEstoque(quantidade);
        }
    }

    public void realizarPedidoReabastecimento(PedidoReabastecimento pedido) {
        pedidos.add(pedido);
        registrarEntrada(pedido.getProduto().getCod(), pedido.getQuantidade());
    }

    private Produto encontrarProdutoPorCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCod().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    public void gerarRelatorioEstoque() {
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCod() + ", Nome: " + produto.getNome() + ", Categoria: " + produto.getCategoria() + ", Quantidade: " + produto.getQuantidade() + ", Preço: " + produto.getPreco());
        }
    }
}

