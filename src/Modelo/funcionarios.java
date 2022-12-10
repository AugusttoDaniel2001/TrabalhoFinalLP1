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
public class funcionarios {
    private Integer id_funcionarios;
    private String nome;
    private String cargo;

    public Integer getId_funcionarios() {
        return id_funcionarios;
    }

    public void setId_funcionarios(Integer id_funcionarios) {
        this.id_funcionarios = id_funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public funcionarios() {
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
