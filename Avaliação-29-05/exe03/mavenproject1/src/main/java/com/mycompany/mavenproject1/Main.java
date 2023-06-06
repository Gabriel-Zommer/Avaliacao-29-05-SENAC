/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a figura geométrica:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Círculo");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        FiguraGeometrica figura;

        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                figura = new Quadrado(lado);
                break;
            case 2:
                System.out.print("Digite o comprimento do retângulo: ");
                double comprimento = scanner.nextDouble();
                System.out.print("Digite a largura do retângulo: ");
                double largura = scanner.nextDouble();
                figura = new Retangulo(comprimento, largura);
                break;
            case 3:
                System.out.print("Digite a base do triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double altura = scanner.nextDouble();
                figura = new Triangulo(base, altura);
                break;
            case 4:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                figura = new Circulo(raio);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double area = figura.calcularArea();
        System.out.println("A área da figura é: " + area);
    }
}
