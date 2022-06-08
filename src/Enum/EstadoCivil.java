package Enum;

public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");

    private String descricao;

    EstadoCivil(String descricao){
        this.descricao= descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
