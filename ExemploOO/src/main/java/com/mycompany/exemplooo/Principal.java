/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplooo;


/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        //Instaciar objetos usu
        Usuario usu = new Usuario();

        //Passar os dados para classe usuario
        /*usu.setNome("Rafael");
        usu.setIdade(18);
        usu.setEmail("rafael@gmail.com");
        usu.setTelefone("(13) 9999-9999");*/
        //Chamar metodo cadastrar dados
        usu.cadastrarDados();

        //Chamar metodo mostrar
        usu.MostrarDados();
    }
}
