/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioprova;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        setPontos(Double.parseDouble(JOptionPane.showInputDialog("Digite os pontos: ")));
        
        if(getPontos() <= 100){
            setNivel("nivel 1");
        }
        else if(getPontos() > 100 && getPontos() <200){
            setNivel("nivel 2");
        }
        else{
            setNivel("nivel 3");
        }
    }
    
    public void listarResultado(){
        JOptionPane.showMessageDialog(null, "Nome: "+getNome()+"\nPontos: "+getPontos()+"\nNivel: "+getNivel());
    }
}
