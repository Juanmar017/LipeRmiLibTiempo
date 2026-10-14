/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmartinez.seminario.tiempo.rmi.lib;

import java.io.Serializable;

/**
 *
 * @author 57301
 */
public class DatosTiempo implements Serializable{
    
    private int horas;
    private int minutos;
    private int segundos;
    private int totalSegundos;

    public DatosTiempo() {}

    // Getters y Setters
    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }

    public int getMinutos() { return minutos; }
    public void setMinutos(int minutos) { this.minutos = minutos; }

    public int getSegundos() { return segundos; }
    public void setSegundos(int segundos) { this.segundos = segundos; }

    public int getTotalSegundos() { return totalSegundos; }
    public void setTotalSegundos(int totalSegundos) { this.totalSegundos = totalSegundos; }
}
