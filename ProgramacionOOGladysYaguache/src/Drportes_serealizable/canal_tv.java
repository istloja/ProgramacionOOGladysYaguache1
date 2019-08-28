/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drportes_serealizable;

/**
 *
 * @author HOGAR
 */
public class canal_tv {
    private String nombre;
    private int numero_de_canal;
    private String categoria_de_canal;
    private int trabajadores;
    private int horas_de_trabajo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_de_canal() {
        return numero_de_canal;
    }

    public void setNumero_de_canal(int numero_de_canal) {
        this.numero_de_canal = numero_de_canal;
    }

    public String getCategoria_de_canal() {
        return categoria_de_canal;
    }

    public void setCategoria_de_canal(String categoria_de_canal) {
        this.categoria_de_canal = categoria_de_canal;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(int trabajadores) {
        this.trabajadores = trabajadores;
    }

    public int getHoras_de_trabajo() {
        return horas_de_trabajo;
    }

    public void setHoras_de_trabajo(int horas_de_trabajo) {
        this.horas_de_trabajo = horas_de_trabajo;
    }

    public canal_tv() {
    }
}


