package com.registro.restapi.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Avaliacao {
    @Id
    private Long id;

    @Column(nullable = false)
    private String avaliacao;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
}
