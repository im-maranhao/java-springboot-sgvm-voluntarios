package br.com.service;

import br.com.repository.VoluntarioRepository;

public class VoluntarioService {
    private final VoluntarioRepository repository;

    public VoluntarioService(VoluntarioRepository repository){
        this.repository = repository;
    }


    public Voluntario cadastrar(Voluntario voluntario) {
        voluntario.setAtivo(true);
        return repository.save(voluntario);
    }

    public List<Voluntario> listar() {
        return repository.findAll();
    }

}
