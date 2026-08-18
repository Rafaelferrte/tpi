/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Contatos {
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void cadastrarDados() {
        Scanner l = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        setNome(l.nextLine());
        System.out.println("Digite o telefone: ");
        setTelefone(l.nextLine());
        System.out.println("Digite o endereço: ");
        setEndereco(l.nextLine());
        System.out.println("Digite a cidade: ");
        setCidade(l.next());
    }
    
    public void mostrarDados() {
        System.out.println("=== Dados Usuario ===");
        System.out.println("Nome Usuario: "+getNome()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereco: "+getTelefone()+"\n"+"Cidade: "+getCidade());
    }
}
