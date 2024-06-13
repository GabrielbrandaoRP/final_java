public interface Produto {

    String getCod();
    String getNome();
    CategoriaProduto getCategoria();

    int getQuantidade ;
    double getPreco ;
    void addEstoque(int quantidade);
    void removeEstoque(int quantidade);

}
