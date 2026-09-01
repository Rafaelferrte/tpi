/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioooproduto;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = l.nextInt();

        p.cadastrarProduto(quantidade);

        System.out.println("\n=== DADOS DO PRODUTO ===");
        System.out.println("Produto: " + p.getNomeProduto());
        System.out.println("Quantidade: " + p.getQuantidade());
        System.out.println("Valor unitário: R$ " + p.getValor());
        System.out.println("Valor total: R$ " + p.calcularTotal());
    }
}
