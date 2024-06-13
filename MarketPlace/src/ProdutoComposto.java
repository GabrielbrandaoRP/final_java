import java.util.List;

public class ProdutoComposto extends ProdutoBase {
    private List<Produto> componentes;

    public ProdutoComposto(String cod, String nome, CategoriaProduto categoria, int quantidade, double preco, List<Produto> componentes) {
        super(cod, nome, categoria, quantidade, preco);
        this.componentes = componentes;
    }

    public List<Produto> getComponentes() {
        return componentes;
    }
}
