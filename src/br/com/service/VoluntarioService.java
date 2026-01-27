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

    @Override
    public Voluntario salvar(Voluntario voluntario) {
        voluntario.setAtivo(true);
        return repository.save(voluntario);
    }

    @Override
    public Voluntario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Voluntário não encontrado"));
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    // método EXTRA (não faz parte do contrato)
    public List<Voluntario> listar() {
        return repository.findAll();
    }
}
