/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantidadeproduto;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class QuantidadeProduto {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        double valor1, valor2,valor3,total,valorproduto1,valorproduto2,valorproduto3;
        String produto1,produto2,produto3;
        int qtd1,qtd2,qtd3;
        
        System.out.println("Digite o nome do produto 1: ");
        produto1 = l.next();
        System.out.println("Digite o valor do produto 1: ");
        valor1 = l.nextDouble();
        System.out.println("Digite a quantidade do produto 1: ");
        qtd1 = l.nextInt();
        
        System.out.println("Digite o nome do produto 2: ");
        produto2 = l.next();
        System.out.println("Digite o valor do produto 2: ");
        valor2 = l.nextDouble();
        System.out.println("Digite a quantidade do produto 2: ");
        qtd2 = l.nextInt();
        
        System.out.println("Digite o nome do produto 3: ");
        produto3 = l.next();
        System.out.println("Digite o valor do produto 3: ");
        valor3 = l.nextDouble();
        System.out.println("Digite a quantidade do produto 3: ");
        qtd3 = l.nextInt();
        
        valorproduto1 = (valor1*qtd1);
        valorproduto2 = (valor2*qtd2);
        valorproduto3 = valor3*qtd3;
        
        total = valorproduto1+valorproduto2+(valorproduto3);
        
        System.out.println("O valor do "+produto1+" é R$"+valor1);
        System.out.println("O valor do "+produto2+" é R$"+valor2);
        System.out.println("O valor do "+produto3+" é R$"+valor3);
        System.out.println("O valor total dos produtos é R$"+ total);
    }
}
