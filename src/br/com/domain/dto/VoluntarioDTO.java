package br.com.domain.dto;

@Getter
@Setter
public class VoluntarioDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Email(message = "Email inválido")
    @NotBlank
    private String email;

    @NotBlank
    private String telefone;
}
