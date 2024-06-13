public abstract class ProdutoBase extends Produto {

    private String codProduto;
    private String nome;
    private CategoriaProduto categoria;

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private int quantidade;
    private double preco;

    public ProdutoBase(String codProduto, String nome, CategoriaProduto categoria, int quantidade, double preco) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String getCodProduto() {
        return codProduto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public CategoriaProduto getCategoria() {
        return categoria;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade insuficiente em estoque");
        }
    }
}
