package br.com.domain.dto;

@Getter
@Setter
public class VoluntarioDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

}
