package Model;


public class Caso {

    
  
    private int codigo_caso;
    private String tipo_de_servico;
    private double valor_dos_honorarios;
    private int parcelas;
    private String data_vencimento;
    private String descricao;



    public Caso(int codigo_caso, String tipo_de_servico, double valor_dos_honorarios, int parcelas, String data_vencimento, String descricao){
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

    
    public String getTipo_de_servico() {
        return tipo_de_servico;
    }

    
    public void setTipo_de_servico(String tipo_de_servico) {
        this.tipo_de_servico = tipo_de_servico;
    }

    
    public double getValor_dos_honorarios() {
        return valor_dos_honorarios;
    }

    
    public void setValor_dos_honorarios(double valor_dos_honorarios) {
        this.valor_dos_honorarios = valor_dos_honorarios;
    }

    
    public int getParcelas() {
        return parcelas;
    }

    
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    
    public String getData_vencimento() {
        return data_vencimento;
    }

    
    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    
    @Override
    public String toString() {
       return "Caso{" +
               "codigo_caso=" + getCodigo_caso() +
               ", tipo_do_servico" + getTipo_de_servico() + '\'' +
               ", valor_dos_honorarios" + getValor_dos_honorarios() + '\'' +
               ", parcelas" + getParcelas() + '\'' +
               "data_vencimento" + getData_vencimento() + '\'' +
               "descricao" + getDescricao() + '\'' +
               '}';
    }

}
