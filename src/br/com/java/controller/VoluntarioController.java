package br.com.controller;

import br.com.domain.model.Voluntario;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {

    private final VoluntarioService service;

    public VoluntarioController(VoluntarioService service){
        this.service = service;
    }

    @PostMapping
    public Voluntario cadastrar(@RequestBody Voluntario voluntario){
        return service.cadastrar(voluntario);
    }

    @GetMapping
    public List<Voluntario> listar(){
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}
