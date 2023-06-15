
package com.registro.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.restapi.database.RepositorioAvaliacao;
import com.registro.restapi.entidade.Avaliacao;

@CrossOrigin
@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoREST 
{
    @Autowired
    private RepositorioAvaliacao repositorio;

    @GetMapping
    public List<Avaliacao> listar() 
    {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Avaliacao contato) 
    {
        repositorio.save(contato);
    }

    @PutMapping
    public void alterar(@RequestBody Avaliacao contato) 
    {
        if (contato.getId() > 0)
            repositorio.save(contato);
    }

    @DeleteMapping
    public void excluir(@RequestBody Avaliacao contato) 
    {
        repositorio.delete(contato);
    }

}
