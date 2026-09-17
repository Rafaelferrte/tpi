/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacaobancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class CategoriaCliente {
    private String nome;
    private int numeroConta;
    private double saldoMedio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void cadastrarCliente(){
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: ")));
        setSaldoMedio(Double.parseDouble(JOptionPane.showInputDialog("Digite o Saldo Medio: ")));
    }
    
    public void verificarSaldo(){
        if(getSaldoMedio() < 1000){
            JOptionPane.showMessageDialog(null,"Saldo Medio: "+ getSaldoMedio()+"\nCliente Comum");
        }
        else if(getSaldoMedio() >= 1000 && getSaldoMedio() < 2500){
            JOptionPane.showMessageDialog(null,"Saldo Medio: "+ getSaldoMedio()+"\nCliente Prata");
        }
        else{
            JOptionPane.showMessageDialog(null,"Saldo Medio: "+ getSaldoMedio()+"\nCliente Ouro");
        }
    }
}
