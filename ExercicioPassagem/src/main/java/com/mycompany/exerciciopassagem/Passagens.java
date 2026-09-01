package com.mycompany.exerciciopassagem;

import java.util.Scanner;

public class Passagens {

    private String nomePassageiro;
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    Scanner l = new Scanner(System.in);

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }

    public void cadastrarDadosPassageiros() {

        System.out.print("Digite o nome do passageiro: ");
        setNomePassageiro(l.nextLine());

        System.out.print("Digite o telefone do passageiro: ");
        setTelefone(l.nextLine());

        System.out.print("Digite o RG do passageiro: ");
        setRg(l.nextLine());
    }

    public void cadastrarDadosPassagem() {

        System.out.print("Digite o local da viagem: ");
        setLocalViagem(l.nextLine());

        System.out.print("Digite a data da viagem: ");
        setData(l.nextLine());

        System.out.print("Digite o horario da viagem: ");
        setHorario(l.nextLine());

        System.out.print("Digite o numero da poltrona: ");
        setNumPoltrona(l.nextLine());
    }

    public String mostrarDadosPassageiro() {

        return "\n=== Dados do Passageiro ===" +
                "\nNome: " + getNomePassageiro() +
                "\nTelefone: " + getTelefone() +
                "\nRG: " + getRg();
    }

    public void mostrarDadosPassagem() {

        System.out.println("\n=== Dados da Passagem ===");

        System.out.println("Local da Viagem: " + getLocalViagem());
        System.out.println("Data: " + getData());
        System.out.println("Horário: " + getHorario());
        System.out.println("Número da poltrona: " + getNumPoltrona());
    }
}