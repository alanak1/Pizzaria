import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario implements Carrinho {
    private static List<String>listaPedidos = new ArrayList<>();
    private List<Produto> carrinho = new ArrayList<>();
    private DecimalFormat df = new DecimalFormat("#.##");

    
    public Cliente(String nome, String email, String password) {
        this.setNome(nome);
        this.setEmail(email);
        this.setPassword(password);
    }

    public static List<String> getListaPedidos(){
        return listaPedidos;
    }
    
    public void pagar(double valor) {
        double troco = carrinho.stream()
                       .mapToDouble(Produto::getPreco)
                       .reduce(valor, (subtotal, preco) -> subtotal - preco);

        if (troco < 0) {
            System.out.println("Pagamento não efetuado devido ao valor insuficiente");
            System.out.println("Valor pago: " + valor);
            System.out.println("Valor total: " + df.format(troco * -1 + valor));
        } else {
            carrinho.forEach(produto -> produto.setQuantidade(produto.getQuantidade() - 1));
            System.out.println("Pagamento efetuado");
            System.out.println("Valor pago: " + valor);
            System.out.println("Troco: " + df.format(troco));
        }
    }

    public void avaliarProduto(float avaliar, Produto produto) {
        produto.setAvaliacao(avaliar);
    }

    public void adicionarCarrinho(Produto produto) {
        if(this.isLogin()){ 
            System.out.println("Adicionado ao carrinho: " + produto.getNome());
            carrinho.add(produto);
        } else {
            System.out.println("Efetue o login primeiro!");
        }
    }

    public List<Produto> getCarrinho(){
        return carrinho;
    }

    public void removerCarrinho(Produto produto) {
        if(carrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
        } else {
            System.out.println("Removido do carrinho: " + produto.getNome());
            carrinho.remove(produto);
        }
    }

    @Override
    public String toString() {
        return "Cliente [ " + "nome: " + getNome() + ", email: " + getEmail() + ", telefone: " + getTelefone() + ", cpf:" + getCpf() + ", idade: " + getIdade() + ", Data de nascimento: " + getDataNascimento() + " ]";
    }
}