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
public class itens_produto {
    private cardapio caradapio;
    private pedido pedido;
    private Integer quantidade;

    public cardapio getCaradapio() {
        return caradapio;
    }

    public void setCaradapio(cardapio caradapio) {
        this.caradapio = caradapio;
    }

    public pedido getPedido() {
        return pedido;
    }

    public void setPedido(pedido pedido) {
        this.pedido = pedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public itens_produto() {
    }
    
    
}
