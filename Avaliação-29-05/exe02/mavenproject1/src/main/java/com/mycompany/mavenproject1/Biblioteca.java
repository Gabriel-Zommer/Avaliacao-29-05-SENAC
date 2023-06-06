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
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        emprestimos = new ArrayList<>();
    }

    public void realizarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void mostrarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo realizado.");
        } else {
            System.out.println("Empréstimos realizados:");
            for (Emprestimo emprestimo : emprestimos) {
                System.out.println(emprestimo);
            }
        }
    }
}