public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String descricao;

    public Produto(String nome, double preco, int quantidade, String descricao) {
        this.nome = nome; 
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
