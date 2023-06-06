/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Zommer
 */
public class Telefonico extends Contato {
    private String numero;

    public Telefonico(String nome, String numero) {
        super(nome);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número: " + numero);
    }
}

