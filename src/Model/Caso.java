package Model;

public class Caso<date> {
    private int codigo_caso;
    private String tipo_de_servico;
    private double valor_dos_honorarios;
    private int parcelas;
    private date data_vencimento;
    private String descricao;



    public Caso(int codigo_caso, String tipo_de_servico, double valor_dos_honorarios, int parcelas, date data_vencimento, String Descrisao){
        this.codigo_caso = codigo_caso;
        this.tipo_de_servico = tipo_de_servico;
        this.valor_dos_honorarios = valor_dos_honorarios;
        this.parcelas =  parcelas;
        this.data_vencimento = data_vencimento;
        this.descricao = descricao;
    }

    public int getCodigo_caso() {
        return codigo_caso;
    }

    public void setCodigo_caso(int codigo_caso) {
        this.codigo_caso = codigo_caso;
    }

    public double getValor_dos_honorarios() {
        return valor_dos_honorarios;
    }

    public void setValor_dos_honorarios(double valor_dos_honorarios) {
        this.valor_dos_honorarios = valor_dos_honorarios;
    }

    public String getTipo_de_servico() {
        return tipo_de_servico;
    }

    public void setTipo_de_servico(String tipo_de_servico) {
        this.tipo_de_servico = tipo_de_servico;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrisao) {
        this.descricao = descrisao;
    }
    @Override
    public String toString() {
       return "Caso{" +
               "codigo_caso=" + codigo_caso +
               ", tipo_do_servico" + tipo_de_servico + '\'' +
               ", valor_dos_honorarios" + valor_dos_honorarios + '\'' +
               ", parcelas" + parcelas + '\'' +
               "data_vencimento" + data_vencimento + '\'' +
               "descricao" + descricao + '\'' +
               '}';
    }

}
