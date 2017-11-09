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
public class Edificio extends Inmueble implements Informacion {

    private String propietario;
    private ArrayList<LocalComercial> local;
    private ArrayList<Piso> piso;
    
    public Edificio(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, String propietario) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.propietario = propietario;
        this.local = new ArrayList<>();
        this.piso = new ArrayList<>();
    }
    public void AgregarPiso(Piso p){
        this.piso.add(p);
    }
    public void AgregarLocal(LocalComercial l){
        this.local.add(l);
    }
    @Override
    public String DarInformacion() {
        String informacionL="";
        for(LocalComercial l:this.local){
            informacionL += l.DarInformacion();
        }
        
        String informacionP = "";
        for(Piso p: this.piso){
            informacionP += p.DarInformacion();
        } 
        return "Edificio" + super.toString() + "{" + "propietario=" + propietario + informacionL + informacionP;
    }


    
}
