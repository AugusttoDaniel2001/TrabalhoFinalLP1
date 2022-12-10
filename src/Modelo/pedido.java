/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.Calendar;

/**
 *
 * @author Daniel
 */
public class pedido {
    private Integer id_pedido;
    private Double total_preco;
    private Calendar data_pedido;
    private Time horario;
    private Double desconto;
    private clientes cliente;

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Double getTotal_preco() {
        return total_preco;
    }

    public void setTotal_preco(Double total_preco) {
        this.total_preco = total_preco;
    }

    public Calendar getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Calendar data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public clientes getCliente() {
        return cliente;
    }

    public void setCliente(clientes cliente) {
        this.cliente = cliente;
    }

    public pedido() {
    }
    
    
}
