/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medidaretangulo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class MedidaRetangulo {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double a,b,area,perimetro;
        System.out.println("Digite o lado a (cm): ");
        a = l.nextDouble();
        System.out.println("Digite o lado b (cm): ");
        b = l.nextDouble();
        area = a*b;
        perimetro = (2*a)+(2*b);
        System.out.println("A área do retângulo é "+ area+"cm² e o perimetro é "+perimetro+"cm");
    }
}
