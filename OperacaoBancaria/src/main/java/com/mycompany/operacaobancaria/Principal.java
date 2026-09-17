/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacaobancaria;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        CategoriaCliente cc = new CategoriaCliente();
        
        cc.cadastrarCliente();
        cc.verificarSaldo();
    }
}
