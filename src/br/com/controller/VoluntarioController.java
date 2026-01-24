package br.com.controller;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {

    private final VoluntarioService service;

    public VoluntarioController(VoluntarioService service){
        this.service = service;
    }
}
