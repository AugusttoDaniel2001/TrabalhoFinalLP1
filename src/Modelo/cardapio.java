/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Daniel
 */
public class cardapio {
    private Integer id_caradapio;
    private String nome;
    private Double preco;
    private Double desconto;

    public Integer getId_caradapio() {
        return id_caradapio;
    }

    public void setId_caradapio(Integer id_caradapio) {
        this.id_caradapio = id_caradapio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public cardapio() {
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
            
}
