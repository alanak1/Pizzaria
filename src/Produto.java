public class Produto {
    private String nome;
    private String descricao;
    private float avaliacao;
    private char tamanho;
    private double preco;
    private int quantidade;

    public Produto() {
        nome = "Tradicional";         
        descricao = "Pizza gostosa";
        tamanho = 'P';
        preco = 25.00;
        quantidade = 15;
    }

    public Produto(String nome, double preco, int quantidade, String descricao) {
        this.nome = nome; 
        this.preco = preco;

        if (quantidade != 0) {
            this.quantidade = quantidade;
        }

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

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
