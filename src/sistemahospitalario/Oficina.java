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
public class Oficina extends Cuarto{
    private int tipo;

    public int getTipo() {
        return tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public Oficina(int numero,Piso piso){
        super(numero,piso);
        this.tipo=0;
    }
    
}
