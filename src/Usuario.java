public class Usuario {
    private String nome;
    private String email;
    private String password;
    private String telefone;
    private String cpf;
    private String dataNascimento;
    private int idade;
    private boolean login;

    public Usuario() {
        this.nome = "Jorge";
        this.email = "jorge@gmail.com";
        this.password = "123";
        this.telefone = "123456789";
        this.cpf = "123.456.789-00";
        this.dataNascimento = "01/01/2006";
        this.idade = 18;
    }

    public Usuario(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public void logar(String email, String password) {
        boolean logado = email.toLowerCase().equals(this.email) && password.toLowerCase().equals(this.password);

        if (logado) {
            System.out.println("Login efetuado com sucesso!");
            login = true;
        } else {
            System.out.println("Email ou senha inválidos!");
        }
    }

    public boolean isLogin(){
        return login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuario [ " + "nome: " + nome + ", email: " + email + ", telefone: " + telefone + ", cpf:" + cpf + ", idade: " + idade + " Data de nascimento: " + dataNascimento + " ]";
    }
}