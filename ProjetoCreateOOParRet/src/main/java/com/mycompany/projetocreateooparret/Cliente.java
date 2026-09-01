/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocreateooparret;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Cliente {
    // atributos
    private String nome;
    private String rg;
    private String ende;
    private int idade;

    // encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
     
    //metodos
    public void cadastrarCliente(String rg){
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        //rg é o parâmetro que vem da classe Principal
        setRg(rg);
        setEnde(JOptionPane.showInputDialog("Digite o endereco: "));
        //Conversão para número inteiros Integer.parseInt
        // Conversão para numeros reais Double.parseDouble
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
        
    };
    public String listarCliente(){
        return "Nome: " + getNome() + 
                "\n Endereço: " + getEnde() +
                "\n RG: " + getRg() +
                "\n Idade: " + getIdade();
    }
}
