/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.litrosabastecidos;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class LitrosAbastecidos {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        double qtdLitros, valorPago;
        
        System.out.println("Digite a quantidade de litros abastecidos: ");
        qtdLitros = l.nextDouble();
        
        valorPago = qtdLitros * 6.49;
        
        System.out.println("O valor a ser pago é " + valorPago);
    }
}
