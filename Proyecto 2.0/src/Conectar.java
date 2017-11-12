import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mongodb.morphia.query.UpdateOperations;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafer
 */
public class Conectar{
    private Datastore ds;
    private List<Hotel> hoteles;
    private List<Evento> eventos;
    private List<Restaurante> restaurante;
    private List<LugarT> lugar;
    private List<Actividad> acts;
    private List<Usuario> usuarios;
    
    /**
     *Constructor for objects of class Conexion
     */
    public Conectar(){
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Lugar.class).map(Hotel.class).map(Evento.class).map(Restaurante.class).map(Actividad.class).map(Usuario.class).map(LugarT.class);
        ds = morphia.createDatastore(mongo, "Proyecto"); // Base Datos
    }  
    
    public void addRestaurante(Restaurante r){
        ds.save(r);
    }
    
    public void addEvento(Evento e){
        ds.save(e);
    }
    
    public void addLugar(LugarT l){
        ds.save(l);
    }
    
    public void addHotel(Hotel h){
        ds.save(h);
    }
    
    public void addActividad(Actividad a){
        ds.save(a);
    }
    
    public List<Hotel> mostrarHoteles(){
        Query<Hotel> query = ds.createQuery(Hotel.class);
        hoteles = query.asList();
        return hoteles;
    }
    
    public List<Evento> mostrarEventos(){
        Query<Evento> query = ds.createQuery(Evento.class);
        eventos = query.asList();
        return eventos;
    }
    
    public List<Restaurante> mostrarRestaurante(){
        Query<Restaurante> query = ds.createQuery(Restaurante.class);
        restaurante = query.asList();
        return restaurante;
    }
    
    public List<LugarT> mostrarLugares(){
        Query<LugarT> query = ds.createQuery(LugarT.class);
        lugar = query.asList();
        return lugar;
    }
    
    public List<Usuario> mostrarUsuarios(){
        Query<Usuario> query = ds.createQuery(Usuario.class);
        usuarios = query.asList();
        return usuarios;
    }
    
    public List<Actividad> mostrarActs(){
        Query<Actividad> query = ds.createQuery(Actividad.class);
        acts = query.asList();
        return acts;
    }
    
    
}
