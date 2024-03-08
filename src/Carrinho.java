import java.util.List;

public interface Carrinho {
    void adicionarCarrinho(Produto produto);
    List<Produto> getCarrinho();
    void removerCarrinho(Produto produto);
}
