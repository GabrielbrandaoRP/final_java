import javax.sound.sampled.Port;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Cadastrar produtos
        Produto produto1 = new ProdutoSimples("P001", "Notebook", CategoriaProduto.ELETRONICOS, 10, 3000.00);
        Produto produto2 = new ProdutoSimples("P002", "Calça Jeans", CategoriaProduto.ROUPAS, 50, 100.00);
        estoque.cadastrarProduto(produto1);
        estoque.cadastrarProduto(produto2);

        // Cadastrar fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Tech Supplies", "1234567890001");
        estoque.cadastrarFornecedor(fornecedor1);

        // Registrar entrada de estoque
        estoque.registrarEntrada("P001", 5);

        // Registrar saída de estoque
        estoque.registrarSaida("P002", 10);

        // Realizar pedido de reabastecimento
        PedidoReabastecimento pedido = new PedidoReabastecimento(fornecedor1, produto1, 20);
        estoque.realizarPedidoReabastecimento(pedido);

        // Gerar relatório de estoque
        estoque.gerarRelatorioEstoque();









    }
}