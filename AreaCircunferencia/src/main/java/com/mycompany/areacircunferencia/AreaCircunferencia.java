/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areacircunferencia;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class AreaCircunferencia {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double r, area;
        
        System.out.println("Digite o raio da circunferência: ");
        r = l.nextDouble();
        area = (3.14*(r*r));
        
        System.out.println("A área da circunferência é "+area+"cm²");
    }
}
