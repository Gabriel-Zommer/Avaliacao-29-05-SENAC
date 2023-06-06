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
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");

        Pessoa pessoa1 = new Pessoa("João", "Rua A, 123", "123456789");
        Pessoa pessoa2 = new Pessoa("Maria", "Rua B, 456", "987654321");

        Emprestimo emprestimo1 = new Emprestimo(livro1, pessoa1, "01/05/2023", "15/05/2023");
        Emprestimo emprestimo2 = new Emprestimo(livro2, pessoa2, "05/05/2023", "20/05/2023");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.realizarEmprestimo(emprestimo1);
        biblioteca.realizarEmprestimo(emprestimo2);

        biblioteca.mostrarEmprestimos();
    }
}