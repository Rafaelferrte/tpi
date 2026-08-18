/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dobrotriplo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class DobroTriplo {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        int num1,num2,dobro,triplo;
        
        System.out.println("Digite o primeiro número: ");
        num1 = l.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = l.nextInt();
        
        dobro = 2*num1;
        triplo = 3*num2;
        
        System.out.println("O n´mero 1 é "+num1+" e o dobro é "+dobro);
        System.out.println("O n´mero 2 é "+num2+" e o triplo é "+triplo);
    }
}
