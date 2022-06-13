package Model;

public class Usuario {

    private int codigo_usuario;
    private String login;
    private String senha;
    private String nome;


    public Usuario(int codigo_usuario, String login, String senha, String nome) {
        this.codigo_usuario = codigo_usuario;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }
    
     public int getCodigo_usuario() {
        return codigo_usuario;
    }

  
    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    
    public String getLogin() {
        return login;
    }

    
    public void setLogin(String login) {
        this.login = login;
    }

    
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
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
                "codigo_usuario=" + getCodigo_usuario() +
                ", nome='" + getNome() + '\'' +
                ", login='" + getLogin() + '\'' +
                ", senha='" + getSenha() + '\'' +
                '}';
    }

}