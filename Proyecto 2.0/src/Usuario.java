
import org.mongodb.morphia.annotations.Embedded;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafer
 */
@Embedded
public class Usuario {
    private String nombre;
    private String email;
    private String  pw;
    private boolean admin;
    
    public Usuario(){}
    
    public Usuario(String nombre, String email, String pw, boolean admin){
        this.nombre=nombre;
        this.email=email;
        this.admin=admin;
        this.pw=pw;
    }
    public String getpw(){
        return pw;
    }
    public boolean getAd(){
        return admin;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmail(){
        return email;
    }
   
}
