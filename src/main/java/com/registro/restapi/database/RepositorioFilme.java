package com.registro.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registro.restapi.entidade.Filme;

public interface RepositorioFilme extends JpaRepository<Filme, Long> {
    
}
