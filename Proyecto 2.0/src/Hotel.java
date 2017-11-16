
import org.mongodb.morphia.annotations.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafer
 */
@Entity
public class Hotel extends Lugar {
    //Atributos 
     private String correo;
     private String telefono;
     
     /**
      * Constructor for objects of class Hotel
      * @param nombre
      * @param direccion
      * @param departamento
      * @param descripcion
      * @param calificacion
      * @param c1
      * @param c2
      * @param c3
      * @param c4
      * @param c5
      * @param telefono
      * @param correo 
      */
    public Hotel(String nombre, String direccion, String departamento, String descripcion, double calificacion, int c1, int c2, int c3, int c4, int c5, String telefono, String correo) {
        super(nombre, direccion, departamento, descripcion, calificacion, c1, c2, c3, c4, c5);
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
    public Hotel() {}
    
    
    /**
    * @return: retorna correo de hotel.
    */
    public String getCorreo() {
	return correo;
    }
    
    /**
    * @return: retorna telefono.
    */
    public String getTel() {
        return telefono;
    }
    public String getDepartamento(){
        return departamento;
    }
    
     @Override
    public String toString(){
        String msj2 = "Correo: " + getCorreo() + " Telefono " + getTel();
        return msj2 + super.toString();
    }
    
}
