/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocaseif;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Media {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void inserirNotas(){
        setNome(JOptionPane.showInputDialog("Nome Aluno: "));
        setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")));
    }
    
    public double calcularMedia(){
        setMedia( (getNota1() + getNota2())/2);
        return getMedia();
    }
    
    public void verificarSituacao(){
        if (getMedia() < 4)
        {
            JOptionPane.showMessageDialog(null, getNome() + " esta reprovado, a media eh "+ getMedia());
        }
        else if ((getMedia() == 4) || (getMedia() <= 5))
        {
            JOptionPane.showMessageDialog(null,getNome() + " esta de exame, a media eh " + getMedia());
        }
    }
}
