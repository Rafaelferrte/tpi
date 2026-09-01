/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocreateooparret;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        // Instanciar objeto
        Cliente c = new Cliente();
        //lê o rg para passar por parâmetro
        String rg = JOptionPane.showInputDialog("Digite o RG: ");
        // chama o metodo cadastrar passando o parâmetro rg
        c.cadastrarCliente(rg);
        
        System.out.println(c.listarCliente());
        //mostra mensagem retornando os dados de método listar
        JOptionPane.showMessageDialog(null, c.listarCliente());
    }
}
