/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Zommer
 */
class TesteAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[10];
        animais[0] = new Cachorro("Rex", 5);
        animais[1] = new Gato("Mimi", 3);
        animais[2] = new Galinha("Cocó", 2);
        

        for (int i = 0; i < animais.length; i++) {
            if (animais[i] != null) {
                animais[i].emitirSom();
            }
        }
    }
}
