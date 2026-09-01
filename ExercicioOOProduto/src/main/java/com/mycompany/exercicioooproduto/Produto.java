/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioooproduto;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {
    private String nomeProduto;
    private int quantidade;
    private double valor;
    private double total;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void cadastrarProduto(int quant) {

        Scanner l = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        setNomeProduto(l.nextLine());

        System.out.print("Digite o valor do produto: R$ ");
        setValor(l.nextDouble());

        setQuantidade(quant);
    }

    public double calcularTotal() {

        setTotal(getValor() * getQuantidade());

        return getTotal();
    }
}
