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
public class Aplicaccion {
    private ArrayList<LocalComercial> local;
    private ArrayList<Edificio> edificio;
    private ArrayList<Piso> piso;
    private ArrayList<Oficina> oficina;

    public Aplicaccion() {
        this.edificio = new ArrayList<>();
        this.local = new ArrayList<>();
        this.oficina = new ArrayList<>();
        this.piso = new ArrayList<>();
    }
    public void CrearLocalComercial(String barrio,int estrato,double valorArriendo,double areaConstruida,String descripcion,boolean viaPricipal ){
        LocalComercial l = new LocalComercial(barrio, estrato, valorArriendo, areaConstruida, descripcion, viaPricipal);
        this.local.add(l);
    }
    public void CrearEdificio(String barrio,int estrato,double valorArriendo,double areaConstruida,String propietario ){
        Edificio e = new Edificio(barrio, estrato, valorArriendo, areaConstruida, propietario);
        this.edificio.add(e);
    }
    public void CrearPiso(String barrio,int estrato,double valorArriendo,double areaConstruida,int numeroOficinas, double area){
        Piso p = new Piso(barrio, estrato, valorArriendo, areaConstruida, numeroOficinas, area);
        this.piso.add(p);
    }
    public void CrearOfcina(String barrio,int estrato,double valorArriendo,double areaConstruida, String tipo){
        Oficina o = new Oficina(barrio, estrato, valorArriendo, areaConstruida);
        this.oficina.add(o);
    }
    public void QuitarLocalComercial(String barrio,int estrato,double valorArriendo,double areaConstruida,String descripcion,boolean viaPricipal ){
        
    }
    public void QuitarEdificio(String barrio,int estrato,double valorArriendo,double areaConstruida,String propietario ){
        
    }
    public void QuitarPiso(String barrio,int estrato,double valorArriendo,double areaConstruida,int numeroOficinas, double area){
        
    }
    public void QuitarOfcina(String barrio,int estrato,double valorArriendo,double areaConstruida, String tipo){
        
    }
    public void CambiarLocalComercial(String barrio,int estrato,double valorArriendo,double areaConstruida,String descripcion,boolean viaPricipal ){
        
    }
    public void CambiarEdificio(String barrio,int estrato,double valorArriendo,double areaConstruida,String propietario ){
        
    }
    public void CambiarPiso(String barrio,int estrato,double valorArriendo,double areaConstruida,int numeroOficinas, double area){
        
    }
    public void CambiarOfcina(String barrio,int estrato,double valorArriendo,double areaConstruida, String tipo){
        
    }
    public void InformacionComercial(){
        String i = "";
        for (LocalComercial l:this.local){
            i += l.DarInformacion();
        }
        System.out.println(i);
    }
    public void InformacionEdificio(){
        String i = "";
        for (Edificio e:this.edificio){
            i += e.DarInformacion();
        }
        System.out.println(i);
    }
    public void InformacionPiso(){
        String i = "";
        for (Piso p:this.piso){
            i += p.DarInformacion();
        }
        System.out.println(i);
    }
    public void InformacionOfcina(){
        String i = "";
        for (Oficina o:this.oficina){
            i += o.DarInformacion();
        }
        System.out.println(i);
    }
}
