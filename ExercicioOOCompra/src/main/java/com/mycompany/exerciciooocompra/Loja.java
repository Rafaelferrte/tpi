/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciooocompra;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Loja {
    // Atributos
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private int qtdItensComp;
    private double valorTotalCompra;

    // Método para inserir os dados
    public void inserirDadosLoja() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a razão social da loja: ");
        razaoSocial = sc.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        cpfCliente = sc.nextLine();

        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = sc.nextDouble();

        System.out.print("Digite a quantidade de itens: ");
        qtdItensComp = sc.nextInt();
    }

    // Método para calcular o valor total
    public double calcularCompraLoja() {

        valorTotalCompra = valorCompra * qtdItensComp;

        return valorTotalCompra;
    }

    // Método para mostrar os dados
    public String mostrarDadosLoja() {

        return "\n--- DADOS DA COMPRA ---" +
                "\nRazão Social: " + razaoSocial +
                "\nCPF do Cliente: " + cpfCliente +
                "\nValor da Compra: R$ " + valorCompra +
                "\nQuantidade de Itens: " + qtdItensComp +
                "\nValor Total: R$ " + valorTotalCompra;
    }
}