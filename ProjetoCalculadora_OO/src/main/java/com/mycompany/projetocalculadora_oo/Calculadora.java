/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadora_oo;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Calculadora {
    // Atributos
    private double num1;
    private double num2;
    private double resul;

    // Encapsulamento
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResul() {
        return resul;
    }

    public void setResul(double resul) {
        this.resul = resul;
    }
    
    // Método sem parâmetro e sem retorno
    public void Somar(){
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1: ")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2: ")));
        setResul(getNum1() + getNum2());
        JOptionPane.showMessageDialog(null, "O valor dessa soma é: " + getResul());
    }
    
    public void Subtrair(double a, double b){
        setResul(a - b);
        JOptionPane.showMessageDialog(null, "O valor da Subtracao e " + getResul());
    }
    
    //metodo com retorno e sem parametro
    public double Multiplicar(){
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1: ")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2: ")));
        setResul(getNum1()*getNum2());
        return getResul();
    }
    //metodo com retorno e com parametros
    public double Dividir(double a, double b){
        setResul(a / b);
        return getResul();
    }
}
