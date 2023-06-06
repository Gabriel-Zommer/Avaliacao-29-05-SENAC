/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contato;

/**
 *
 * @author Zommer
 */
class Telefonico extends Contato {
    private String telefone;

    public Telefonico(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
}
