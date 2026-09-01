/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioquadrado;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Quadrado {
    private double numero;
    private double resultado;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void calcularQuadrado() {

        Scanner l = new Scanner(System.in);

        System.out.print("Digite um número: ");
        setNumero(l.nextDouble());

        setResultado(Math.pow(getNumero(), 2));
    }

    public void mostrarQuadrado() {

        System.out.println(
            getNumero() + " ao quadrado = " + getResultado()
        );
    }
}
