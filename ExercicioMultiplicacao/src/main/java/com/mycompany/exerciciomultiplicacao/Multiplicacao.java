/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciomultiplicacao;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Multiplicacao {
    // Atributos
    private int valor;
    private int resultado;

    // Getters e Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    // Calcula o valor digitado multiplicado por 10
    public void multiplicacao10() {

        Scanner l = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        setValor(l.nextInt());

        setResultado(getValor() * 10);
    }

    // Mostra o resultado
    public void mostrarMultiplicacao() {

        System.out.println(
            getValor() + " x 10 = " + getResultado()
        );
    }
}
