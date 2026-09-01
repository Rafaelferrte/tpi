/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciooocompra;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.inserirDadosLoja();

        loja.calcularCompraLoja();

        System.out.println(loja.mostrarDadosLoja());
    }
}
