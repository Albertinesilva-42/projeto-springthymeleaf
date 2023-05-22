package com.udemy.projeto.springthymeleaf.service;

import java.util.List;

import com.udemy.projeto.springthymeleaf.entities.Cargo;
import com.udemy.projeto.springthymeleaf.util.PaginacaoUtil;

public interface CargoService {
    
    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo>buscarTodos();

    boolean cargoTemFuncionarios(Long id);

    PaginacaoUtil<Cargo> buscaPorPaginada(int pagina);

}
