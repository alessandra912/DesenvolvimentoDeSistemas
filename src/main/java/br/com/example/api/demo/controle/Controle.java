package br.com.example.api.demo.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.demo.modelo.Pessoa;

@RestController
public class Controle {
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }

    @GetMapping("")
    public String mensagem(){
        return "Olá mundo!";
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Seja bem vindo(a)";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vinda(a)"+nome;
    }
}