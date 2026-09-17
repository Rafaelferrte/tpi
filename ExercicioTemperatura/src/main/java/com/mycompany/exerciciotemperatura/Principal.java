/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciotemperatura;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Temperatura temp = new Temperatura();

        int opcao;
        double valor;

        do {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Converter Fahrenheit para Celsius");
            System.out.println("2 - Converter Celsius para Fahrenheit");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite Fahrenheit: ");
                    valor = scanner.nextDouble();

                    temp.calcularTempCelsius(valor);

                    break;

                case 2:

                    System.out.print("Digite Celsius: ");
                    valor = scanner.nextDouble();

                    temp.calcularTempFahrenheit(valor);

                    break;

                case 0:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        scanner.close();
    
    }
}
