package Model;

import Enum.EstadoCivil;

public class Cliente {
    private int codigo_cliente;
    private String nome;
    private String cpf;
    private String endereco;
    private EstadoCivil estadoCivil;
    private String naturalidade;
    private String cep;


    public Cliente(int codigo_cliente, String nome, String cpf, String endereco, EstadoCivil estadoCivil, String naturalidade, String cep) {
        this.codigo_cliente = codigo_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.naturalidade = naturalidade;
        this.cep = cep;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo_cliente=" + codigo_cliente +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", estadoCivil=" + estadoCivil +
                ", naturalidade='" + naturalidade + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

}
