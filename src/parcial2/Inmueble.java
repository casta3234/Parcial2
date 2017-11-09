/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Estudiante
 */
public abstract class Inmueble{
    private String nombreBarrio;
    private int estrato;
    private double valorArriendo,areaConstruida;

    public Inmueble(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida) {
        this.nombreBarrio = nombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(double valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public String toString() {
        return "{" + "nombreBarrio=" + nombreBarrio + ", estrato=" + estrato + ", valorArriendo=" + valorArriendo + ", areaConstruida=" + areaConstruida + '}';
    }
    
}
