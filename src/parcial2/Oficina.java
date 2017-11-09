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
public class Oficina extends Inmueble implements Informacion{

    private String tipo;
    
    public Oficina(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
    }

    @Override
    public String DarInformacion() {
        return "Oficina"+super.toString()+"{" + "tipo=" + tipo + '}';
    }


}
