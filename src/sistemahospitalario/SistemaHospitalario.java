/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospitalario;

import java.util.Scanner;

/**
 *
 * @author JoseLuis
 */
public class SistemaHospitalario {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Hospital h=new Hospital();
        Scanner sc=new Scanner(System.in);
        int inicio;
        do{
            System.out.println("Sistema Hospitalario del "+h.getNombre());
            System.out.println("Calificación: "+h.getCalificacion());
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Escoger otro hospital");
            System.out.println("3. Salir");
            System.out.println("Encuentrenos en: "+h.getDireccion().toString());
            inicio=sc.nextInt();
            sc.nextLine();
            switch(inicio){
                default:
                    System.out.println("Por favor, seleccione una opción válida");
                    break;
                case 1:
                    int usuario;
                    Piso[] p;
                    p = new Piso[h.getCapacidad()/15];
                    for(int i=0;i<(h.getCapacidad()/15);i++){
                        p[i]=new Piso(i,h);
                    }
                    Habitacion[] hab;
                    hab= new Habitacion[h.getCapacidad()/3];
                    Oficina[] o;
                    o= new Oficina[h.getCapacidad()/3];
                    for(int i=0;i<(h.getCapacidad()/3);i++){
                        hab[i]=new Habitacion(i,p[i/5]);
                        o[i]=new Oficina(i,p[i/5]);
                    }
                    do{
                        System.out.println("¿Qué tipo de usuario es?");
                        System.out.println("1. Funcionario");
                        System.out.println("2. Medico");
                        System.out.println("3. Paciente");
                        System.out.println("4. Atras");
                        usuario=sc.nextInt();
                        sc.nextLine();
                        switch(usuario){
                            case 1:
                                System.out.println("Usted eligio funcionario");
                                System.out.print("Ingrese su usuario (C.I.): ");
                                
                                break;
                            case 2:
                                System.out.println("Usted eligio medico");
                                System.out.println("Por favor, ingrese su nombre distinguiendo entre mayusculas y minusculas ");
                                String userd=sc.nextLine();
                                for(int i=0;i<=(h.getCapacidad()*(2/3));i++){
                                    
                                }
                                break;
                            case 3:
                                System.out.println("Usted eligio paciente");
                                break;
                        }
                    }while(usuario!=4);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del hospital: ");
                    String nombreh=sc.nextLine();
                    System.out.print("Ingrese la calificación del "+nombreh+": ");
                    String calificacion=sc.nextLine();
                    System.out.print("Ingrese la capacidad del "+nombreh+": ");
                    int capacidadh=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la calle principal del "+nombreh+": ");
                    String principal=sc.nextLine();
                    System.out.print("Ingrese la calle secundaria del "+nombreh+": ");
                    String secundaria=sc.nextLine();
                    System.out.print("Ingrese el numero de calle del "+nombreh+": ");
                    String numero=sc.nextLine();
                    h.setHospital(nombreh, calificacion, capacidadh, principal, secundaria, numero);
                    System.out.println(h.getNombre()+" ingresado con exito");
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
            }
        }while(inicio !=3);
    }
}
