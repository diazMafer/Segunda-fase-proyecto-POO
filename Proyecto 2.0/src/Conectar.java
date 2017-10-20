
import java.sql.Connection;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafer
 */
public class Conectar {
    Connection conectar;
    Statement stm;
    public ConexionSQL(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conectar = DriverManager.getConnection();
            Statement stm = conectar.createStatement();
        }catch(Exception e){
            
        }
    }
    
    
    
}
