public class main {
    public static void main(String[] args) {
        Produto pizzaProdutoUm = new Produto("Pizza de Brocolis", 25.00, 20, "Pizza tradicional de queijo com brocolis");
        Produto pizzaProdutoDois = new Produto("Pizza Marguerita", 22.99, 20, "Pizza tradicional sabor Marguerita");
        Produto pizzaProdutoTres = new Produto("Pizza de Peperoni", 29.90, 20, "Pizza tradicional sabor Calabresa");

        Cliente jorge = new Cliente("Jorge", "jorge@gmail", "123");

        jorge.logar("jorge@gmail", "123");
        jorge.adicionarCarrinho(pizzaProdutoTres);
        jorge.adicionarCarrinho(pizzaProdutoUm);
        jorge.adicionarCarrinho(pizzaProdutoDois);

        jorge.removerCarrinho(pizzaProdutoTres);

        jorge.pagar(29.90);
    }
}
