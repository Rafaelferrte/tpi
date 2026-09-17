/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciotemperatura;

/**
 *
 * @author fatec-dsm2
 */
public class Temperatura {
    private double celsius;
    private double fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public void calcularTempCelsius(double F){
        
        setCelsius((F -32)* (5/9.0));
        System.out.println("Temperatura em Celsius: "
                + getCelsius() + " °C");
        
    }
    public void calcularTempFahrenheit(double C) {

        setFahrenheit(C * 1.8 + 32);

        System.out.println("Temperatura em Fahrenheit: "
                + getFahrenheit() + " °F");
    }
    
}
