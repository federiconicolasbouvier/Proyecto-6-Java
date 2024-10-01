/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bouvier.project6;

/**
 *
 * @author Federico Nicolás Bouvier
 */
public class Promedio {
    private String nombre, materia ; //Atributos privados tipo Strings
    private double primera, segunda, tercera, promedio; //Atributos privados tipo Double
    public void setPST(double p, double s, double t){ //Asigna el valor de "p", "s" y "t" a "primera", "segunda" y "tercera" respectivamente (estas serán las notas)
        primera = p;
        segunda = s;
        tercera = t;
    }
    public void setNM(String n, String m){ 
        nombre = n; //Asigna el valor de "n" a "nombre"
        materia = m; //Asigna el valor de "m" a "materia" 
    }
    public double getPrimera(){
        return primera; //Retorna primera
    }
    public double getSegunda(){
        return segunda; //Retorna segunda
    }
    public double getTercera(){
        return tercera; //Retorna tercer
    }
    public String getNombre(){
        return nombre; //Retorna nombre
    }
    public String getMateria(){
        return materia; //Retorna materia
    }
    public void calcularPromedio(){
        promedio = ((primera + segunda + tercera) / 3); //Calcula el promedio de las 3 notas
    }
    public double getPromedio(){
        return promedio; //Retorna promedio
    }
}
