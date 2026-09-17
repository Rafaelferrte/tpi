package com.mycompany.exerciciocombustivel;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Combustivel comb = new Combustivel();

        int op;

        do {

            op = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "===== CONTROLE DE COMBUSTÍVEL =====\n\n"
                    + "1 - Álcool\n"
                    + "2 - Gasolina\n"
                    + "0 - Sair\n\n"
                    + "Escolha uma opção:"
                )
            );

            switch (op) {

                case 1:

                    double kmAlcool = Double.parseDouble(
                        JOptionPane.showInputDialog(
                            "Digite o número de km rodados:"
                        )
                    );

                    double valorAlcool = Double.parseDouble(
                        JOptionPane.showInputDialog(
                            "Digite o valor do litro do álcool:"
                        )
                    );

                    comb.calcularLitrosAlcool(kmAlcool);

                    comb.calcularTotalGasto(valorAlcool);

                    JOptionPane.showMessageDialog(
                        null,
                        "========== RESULTADO ==========\n\n"
                        + "Combustível: Álcool\n"
                        + "Quilômetros rodados: "
                        + String.format("%.2f", kmAlcool) + " km\n"
                        + "Litros consumidos: "
                        + String.format("%.2f", comb.getLitros()) + " L\n"
                        + "Valor por litro: R$ "
                        + String.format("%.2f", valorAlcool) + "\n"
                        + "--------------------------------\n"
                        + "TOTAL GASTO: R$ "
                        + String.format("%.2f", comb.getTotalGasto()) + "\n"
                        + "================================"
                    );

                    break;

                case 2:

                    double kmGasolina = Double.parseDouble(
                        JOptionPane.showInputDialog(
                            "Digite o número de km rodados:"
                        )
                    );

                    double valorGasolina = Double.parseDouble(
                        JOptionPane.showInputDialog(
                            "Digite o valor do litro da gasolina:"
                        )
                    );

                    comb.calcularLitrosGasolina(kmGasolina);

                    comb.calcularTotalGasto(valorGasolina);

                    JOptionPane.showMessageDialog(
                        null,
                        "========== RESULTADO ==========\n\n"
                        + "Combustível: Gasolina\n"
                        + "Quilômetros rodados: "
                        + String.format("%.2f", kmGasolina) + " km\n"
                        + "Litros consumidos: "
                        + String.format("%.2f", comb.getLitros()) + " L\n"
                        + "Valor por litro: R$ "
                        + String.format("%.2f", valorGasolina) + "\n"
                        + "--------------------------------\n"
                        + "TOTAL GASTO: R$ "
                        + String.format("%.2f", comb.getTotalGasto()) + "\n"
                        + "================================"
                    );

                    break;

                case 0:

                    JOptionPane.showMessageDialog(
                        null,
                        "Programa encerrado!"
                    );

                    break;

                default:

                    JOptionPane.showMessageDialog(
                        null,
                        "Opção inválida!"
                    );

                    break;
            }

        } while (op != 0);

    }
}