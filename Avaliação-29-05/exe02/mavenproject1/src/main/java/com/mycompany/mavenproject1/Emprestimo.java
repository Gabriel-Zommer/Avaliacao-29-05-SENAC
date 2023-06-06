/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Zommer
 */
public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Livro livro, Pessoa pessoa, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() +
                "\nPessoa: " + pessoa.getNome() +
                "\nData de Empréstimo: " + dataEmprestimo +
                "\nData de Devolução: " + dataDevolucao + "\n";
    }
}
