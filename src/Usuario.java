public class Usuario {
    private String nome;
    private String endereco;
    private String telefone;
    private String dataNascimento;

    public Usuario(String nome, String telefone){
        this.setNome(nome);
        this.setTelefone(telefone);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String DataNascimento() {
        return dataNascimento;
    }
}
