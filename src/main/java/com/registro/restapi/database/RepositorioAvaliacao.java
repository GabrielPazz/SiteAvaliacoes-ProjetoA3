package com.registro.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registro.restapi.entidade.Avaliacao;

public interface RepositorioAvaliacao extends JpaRepository<Avaliacao, Long> {
    
}
