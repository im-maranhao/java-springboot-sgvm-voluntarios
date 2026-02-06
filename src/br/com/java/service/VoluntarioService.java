package br.com.service;

import br.com.domain.model.Voluntario;
import br.com.repository.VoluntarioRepository;
import br.com.service.contracts.CadastroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoluntarioService implements CadastroService<Voluntario> {


    private final VoluntarioRepository repository;

    public VoluntarioService(VoluntarioRepository repository) {
        this.repository = repository;
    }

    public Voluntario cadastrar(Voluntario voluntario) {
        voluntario.setAtivo(true);
        return repository.save(voluntario);
    }
    public Voluntario observacoes(Long id, String observacoes){
    Voluntario voluntario = repository.finfById(id)
            .orElseThrow(() -> new RuntimeException("Voluntário não encontrado"));
    voluntario.setObservacoes(observacoes);
    return repository.save(voluntario);
}

    public List<Voluntario> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}