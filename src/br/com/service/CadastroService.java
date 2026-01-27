package br.com.service;

public interface CadastroService<T> {

    T salvar(T entidade);
    T buscarPorId(Long id);
    void deletar(Long id);

}
