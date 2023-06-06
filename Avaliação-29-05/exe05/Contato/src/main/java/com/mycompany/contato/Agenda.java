/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contato;

/**
 *
 * @author Zommer
 */
class Agenda {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[5];
        contatos[0] = new Telefonico("João", "123456789");
        contatos[1] = new Email("Maria", "maria@example.com");
        contatos[2] = new Telefonico("Pedro", "987654321");
        contatos[3] = new Email("Ana", "ana@example.com");
        contatos[4] = new Telefonico("Lucas", "555555555");

        for (Contato contato : contatos) {
            if (contato != null) {
                if (contato instanceof Telefonico) {
                    Telefonico telContato = (Telefonico) contato;
                    System.out.println("Nome: " + contato.getNome());
                    System.out.println("Telefone: " + telContato.getTelefone());
                } else if (contato instanceof Email) {
                    Email emailContato = (Email) contato;
                    System.out.println("Nome: " + contato.getNome());
                    System.out.println("Email: " + emailContato.getEmail());
                }

                System.out.println("----------------------");
            }
        }
    }
}
