/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplocaseif;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Media med = new Media();
        
        int op;
        
        // Comando de repetição while
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n1-Inserir Notas \n2-Calcular Media \n3-Verificar Situacao \n0-Sair"));

            switch(op){
                    case 1:
                        med.inserirNotas();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, med.calcularMedia());
                        break;
                    case 3:
                        med.verificarSituacao();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saindo do Sistema...");
                    default:
                        JOptionPane.showMessageDialog(null, "Opcao Invalida");
            }
            
        } while(op != 0);
        
    }
}
