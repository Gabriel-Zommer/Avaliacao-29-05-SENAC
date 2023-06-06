/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zommer
 */
public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void mostrarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia");
        } else {
            System.out.println("Contatos na agenda:");
            for (Contato contato : contatos) {
                contato.mostrarInformacoes();
            }
        }
    }
}
