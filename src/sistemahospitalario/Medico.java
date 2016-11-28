/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospitalario;

/**
 *
 * @author JoseLuis
 */
public class Medico extends Persona {
    private String especialidad;
    private Oficina oficina;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
    public Medico(Oficina oficina){
        this.especialidad="General";
        this.oficina=oficina;
        
    }
    
}
