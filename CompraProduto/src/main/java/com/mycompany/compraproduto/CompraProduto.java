/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compraproduto;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CompraProduto {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        String nomeProduto;
        double preco, total;
        int qtd;
        
        System.out.println("Digite o nome do produto: ");
        nomeProduto = l.next();
        System.out.println("Digite o preço do produto: ");
        preco = l.nextDouble();
        System.out.println("Digite a quantidade comprada: ");
        qtd = l.nextInt();
        
        total = preco * qtd;
        
        System.out.println("O total de "+nomeProduto+" comprados foi "+total);
        
    }
}
