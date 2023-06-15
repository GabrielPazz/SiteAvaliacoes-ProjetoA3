
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
import com.registro.restapi.database.RepositorioFilme;
import com.registro.restapi.entidade.Avaliacao;
import com.registro.restapi.entidade.Filme;

@CrossOrigin
@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoREST 
{
    @Autowired
    private RepositorioAvaliacao repositorio;

     @Autowired
    private RepositorioFilme repoFilme;

    @GetMapping
    public List<Avaliacao> listar() 
    {
        var output = repositorio.findAll();
        var filmes = repoFilme.findAll();

        if(output!=null && output.size() >0)
        {
            for (Avaliacao avaliacao : output) 
            {
                for (Filme filme : filmes) 
                {
                    if(filme.getId() == avaliacao.getId())
                    {
                        avaliacao.setFilme(filme.getNome());
                        avaliacao.setLogo(filme.getLogo());
                    }
                }
            }
        }


        return output;
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
