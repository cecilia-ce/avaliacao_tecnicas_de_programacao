package Model;

public class Pagamento {

    
    
    private int codigo_pagamento;
    private int parcela;
    private double valor_pago;
    private int dia_vencimento;
    private double valor_honorario;
    private int data_pagamento;
    //private Caso caso;
    
    public Pagamento( int codigo_pagamento, int parcela, double valor_pago, int dia_vencimento, double valor_honorario, int data_pagamento){
        this.codigo_pagamento = codigo_pagamento;
        this.parcela = parcela;
        this.valor_pago = valor_pago;
        this.dia_vencimento = dia_vencimento;
        this.valor_honorario = valor_honorario;
        this.data_pagamento = data_pagamento;
    }
    
    
    public int getCodigo_pagamento() {
        return codigo_pagamento;
    }

    public void setCodigo_pagamento(int codigo_pagamento) {
        this.codigo_pagamento = codigo_pagamento;
    }

    
    public int getParcela() {
        return parcela;
    }

    
    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    
    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    
    public int getDia_vencimento() {
        return dia_vencimento;
    }

    
    public void setDia_vencimento(int dia_vencimento) {
        this.dia_vencimento = dia_vencimento;
    }

   
    public double getValor_honorario() {
        return valor_honorario;
    }

    
    public void setValor_honorario(double valor_honorario) {
        this.valor_honorario = valor_honorario;
    }
    
     public int getData_pagamento() {
        return data_pagamento;
    }

   
    public void setData_pagamento(int data_pagamento) {
        this.data_pagamento = data_pagamento;
    }
    
    @Override
    public String toString() {
        return "Pagamento{" +
                "codigo_pagamento=" + codigo_pagamento +
                ", parcela='" + parcela + '\'' +
                ", valor_pago='" + valor_pago + '\'' +
                ", dia_vencimento='" + dia_vencimento + '\'' +
                ", valor_honorario=" + valor_honorario + '}';
    }
    
}
