/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciocliente;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        
        cliente.cadastrarCliente();
        cliente.listarCliente();
    }
}
