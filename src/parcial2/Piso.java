/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Piso extends Inmueble implements Informacion {
    
    private int numeroOficinas;
    private double area;
    private ArrayList<Oficina> oficina;
    
    public Piso(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, int numeroOficinas, double area ) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.numeroOficinas = numeroOficinas;
        this.area = area;
        this.oficina = new ArrayList<>();
    }
    public void AgregarOficina(Oficina o){
        this.oficina.add(o);
    }

    @Override
    public String DarInformacion() {
        String informacionO = "";
        for (Oficina o:this.oficina){
            informacionO += o.DarInformacion();
        }
        return "Piso"+super.toString()+"{" + "numeroOficinas=" + numeroOficinas + ", area=" + area + informacionO;
    }


}
