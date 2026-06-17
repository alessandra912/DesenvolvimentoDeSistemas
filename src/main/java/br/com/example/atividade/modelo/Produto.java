package br.com.example.atividade.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private double preco;

    public Produto() {}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){ 
        return nome; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }
    

    public double getPreco() { 
        return preco; 
    }
    public void setPreco(double preco) { 
        this.preco = preco; 
    }
}