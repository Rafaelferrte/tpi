/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocliente;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Clientes {
    private String nome;
    private String end;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void cadastrarCliente(){
        Scanner l = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        setNome(l.nextLine());
        System.out.println("Digite o endereco: ");
        setEnd(l.nextLine());
        System.out.println("Digite o RG: ");
        setRg(l.nextLine());
        
    }
    
    public void listarCliente(){
        System.out.println("=== Dados do Cliente ===");
        System.out.println("Nome Cliente: "+getNome()+"\n"+"Endereco: "+getEnd()+"\n"+"RG: "+getRg());
    }
    
}
