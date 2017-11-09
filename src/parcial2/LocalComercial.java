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
public class LocalComercial extends Inmueble implements Informacion{
    private String descripcion;
    private boolean viaPrincipal;
    

    public LocalComercial(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, String descripcion, boolean viaPrincipal) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.descripcion = descripcion;
        this.viaPrincipal = viaPrincipal;
    }
    

    @Override
    public String DarInformacion() {
       return "LocalComercial"+super.toString() + "{" + "descripcion=" + descripcion + ", viaPrincipal=" + viaPrincipal + '}';
    }


    
}
