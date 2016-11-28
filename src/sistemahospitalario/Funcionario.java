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
public class Funcionario extends Persona {
    private String ci;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public void registrarPaciente(Paciente paciente, String nombre,int estado,Medico medico,Seguro seguro){
        paciente.setNombre(nombre);
    }
}
