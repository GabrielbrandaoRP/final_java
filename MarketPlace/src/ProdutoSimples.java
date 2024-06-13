public class ProdutoSimples extends ProdutoBase {
    public ProdutoSimples(String codProduto, String nome, CategoriaProduto categoria, int quantidade, double preco) {
        super(codProduto, nome, categoria, quantidade, preco);
    }

    @Override
    public String getCod() {
        return null;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public CategoriaProduto getCategoria() {
        return null;
    }

    @Override
    public void addEstoque(int quantidade) {

    }

    @Override
    public void removeEstoque(int quantidade) {

    }
}