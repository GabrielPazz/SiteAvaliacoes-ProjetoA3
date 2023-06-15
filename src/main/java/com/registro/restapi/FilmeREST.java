
package com.registro.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.restapi.database.RepositorioFilme;
import com.registro.restapi.entidade.Filme;

@RestController
@RequestMapping("/filme")
public class FilmeREST {
    @Autowired
    private RepositorioFilme repositorio;

    @CrossOrigin
    @GetMapping
    public List<Filme> listar() {
        return repositorio.findAll();
    }

}
