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

    private String filme;
    private String logo;
    
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

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
