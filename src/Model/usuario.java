public class usuario {
    private int codigo_usuario;
    private String login;
    private String senha;
    private String nome;


    public usuario(int codigo_usuario, String login, String senha, String nome) {
        this.codigo_usuario = codigo_usuario;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public String getlogin() {
        return login;
    }

    public void setCep(String login) {
        this.login = login;
    }


    public int getsenha() {
        return senha;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codigo_usuario=" + codigo_usuario +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

}