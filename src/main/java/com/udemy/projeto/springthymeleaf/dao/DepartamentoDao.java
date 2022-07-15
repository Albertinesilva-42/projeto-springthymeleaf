package com.udemy.projeto.springthymeleaf.dao;

import java.util.List;

import com.udemy.projeto.springthymeleaf.entities.Departamento;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
