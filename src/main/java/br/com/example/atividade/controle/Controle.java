package br.com.example.atividade.controle;

import org.springframework.web.bind.annotation.RestController;
import br.com.example.atividade.modelo.Produto;
import br.com.example.atividade.repositorio.Repositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controle {
    
    private final Repositorio acao;

    public Controle(Repositorio acao) {
        this.acao = acao;
    }

    @PostMapping("/produto")
    public Produto cadastrar(@RequestBody Produto obj){
        return acao.save(obj);
    }

    @GetMapping("")
    public String teste() {
        return "Cadastre um produto";
    }
}