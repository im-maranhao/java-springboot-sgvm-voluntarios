package br.com.domain.model;

@Entity
public class Voluntario extends Pessoa{

    private String telefone;
    private Boolean ativo;

    @Override
    public String getTipo() {
        return "VOLUNTARIO";
    }
}
