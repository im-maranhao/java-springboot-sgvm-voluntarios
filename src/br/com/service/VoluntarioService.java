package br.com.service;

import br.com.repository.VoluntarioRepository;

public class VoluntarioService {
    private final VoluntarioRepository repository;

    public VoluntarioService(VoluntarioRepository repository){
        this.repository = repository;
    }


}
