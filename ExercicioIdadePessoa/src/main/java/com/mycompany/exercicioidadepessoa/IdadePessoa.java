/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioidadepessoa;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class IdadePessoa {
     private int anoAtual;
    private int ano;
    private int idade;

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void calcularIdade() {

        Scanner l = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu: ");
        setAno(l.nextInt());

        System.out.print("Digite o ano atual: ");
        setAnoAtual(l.nextInt());

        setIdade(getAnoAtual() - getAno());
    }

    public void mostrarIdade() {

        System.out.println("Sua idade é: " + getIdade() + " anos.");
    }
}
