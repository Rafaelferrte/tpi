package com.mycompany.exerciciopassagem;

public class Principal {

    public static void main(String[] args) {

        Passagens p = new Passagens();

        p.cadastrarDadosPassageiros();

        System.out.println(p.mostrarDadosPassageiro());

        p.cadastrarDadosPassagem();

        p.mostrarDadosPassagem();
    }
}