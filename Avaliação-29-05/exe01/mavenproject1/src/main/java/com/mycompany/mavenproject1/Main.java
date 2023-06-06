/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Zommer
 */
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Telefonico contatoTelefonico = new Telefonico("João", "123456789");
        Email contatoEmail = new Email("Maria", "maria@example.com");

        agenda.adicionarContato(contatoTelefonico);
        agenda.adicionarContato(contatoEmail);

        agenda.mostrarContatos();
    }
}