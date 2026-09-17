package com.mycompany.exerciciocombustivel;

public class Combustivel {

    private double litros;
    private double totalGasto;
    private double km;
    private double valorComb;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getValorComb() {
        return valorComb;
    }

    public void setValorComb(double valorComb) {
        this.valorComb = valorComb;
    }

    public void calcularLitrosAlcool(double km) {
        setLitros(km / 12);
    }

    public void calcularLitrosGasolina(double km) {
        setLitros(km / 15);
    }

    public double calcularTotalGasto(double valorComb) {
        setTotalGasto(this.getLitros() * valorComb);

        return getTotalGasto();
    }
}