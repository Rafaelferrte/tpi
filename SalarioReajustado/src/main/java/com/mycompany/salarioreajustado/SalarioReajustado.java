/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarioreajustado;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class SalarioReajustado {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double salario, percentual, novo_salario;
        System.out.println("Digite seu salário mensal: ");
        salario = leia.nextDouble();
        System.out.println("Digite o percentual de reajuste: ");
        percentual = leia.nextDouble();
        novo_salario = salario+(salario*percentual)/100;
        System.out.println("O seu novo salário é R$"+novo_salario );
        
    }
}
