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
public class itens_pedido {
    private estoque estoque;
    private cardapio caradapio;
    private Integer quantidade;

    public estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(estoque estoque) {
        this.estoque = estoque;
    }

    public cardapio getCaradapio() {
        return caradapio;
    }

    public void setCaradapio(cardapio caradapio) {
        this.caradapio = caradapio;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public itens_pedido() {
    }

    
}
