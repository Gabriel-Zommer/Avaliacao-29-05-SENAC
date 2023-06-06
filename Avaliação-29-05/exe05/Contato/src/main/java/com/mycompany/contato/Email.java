/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contato;

/**
 *
 * @author Zommer
 */
class Email extends Contato {
    private String email;

    public Email(String nome, String email) {
        super(nome);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
