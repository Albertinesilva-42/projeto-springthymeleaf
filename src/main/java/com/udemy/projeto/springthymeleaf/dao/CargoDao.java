package com.udemy.projeto.springthymeleaf.dao;

import java.util.List;

import com.udemy.projeto.springthymeleaf.entities.Cargo;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
