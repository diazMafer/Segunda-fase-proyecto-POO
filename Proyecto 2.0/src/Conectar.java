import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mongodb.morphia.query.UpdateOperations;


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
    
    public void addUsuario(Usuario a){
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
    
    public void updateCH1 (int cal){
        Query<Hotel> query = ds.createQuery(Hotel.class);
        for(Hotel i: mostrarHoteles()){
            UpdateOperations xx = ds.createUpdateOperations(Hotel.class).set("c1", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCH2 (int cal){
        Query<Hotel> query = ds.createQuery(Hotel.class);
        for(Hotel i: mostrarHoteles()){
            UpdateOperations xx = ds.createUpdateOperations(Hotel.class).set("c2", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCH3 (int cal){
        Query<Hotel> query = ds.createQuery(Hotel.class);
        for(Hotel i: mostrarHoteles()){
            UpdateOperations xx = ds.createUpdateOperations(Hotel.class).set("c3", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCH4 (int cal){
        Query<Hotel> query = ds.createQuery(Hotel.class);
        for(Hotel i: mostrarHoteles()){
            UpdateOperations xx = ds.createUpdateOperations(Hotel.class).set("c4", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCH5 (int cal){
        Query<Hotel> query = ds.createQuery(Hotel.class);
        for(Hotel i: mostrarHoteles()){
            UpdateOperations xx = ds.createUpdateOperations(Hotel.class).set("c5", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCalH (int cal){
        Query<Hotel> query = ds.createQuery(Hotel.class);
        for(Hotel i: mostrarHoteles()){
            UpdateOperations xx = ds.createUpdateOperations(Hotel.class).set("calificacion", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCR1 (int cal){
        Query<Restaurante> query = ds.createQuery(Restaurante.class);
        for(Restaurante i: mostrarRestaurante()){
            UpdateOperations xx = ds.createUpdateOperations(Restaurante.class).set("c1", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCR2 (int cal){
        Query<Restaurante> query = ds.createQuery(Restaurante.class);
        for(Restaurante i: mostrarRestaurante()){
            UpdateOperations xx = ds.createUpdateOperations(Restaurante.class).set("c2", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCR3 (int cal){
        Query<Restaurante> query = ds.createQuery(Restaurante.class);
        for(Restaurante i: mostrarRestaurante()){
            UpdateOperations xx = ds.createUpdateOperations(Restaurante.class).set("c3", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCR4 (int cal){
        Query<Restaurante> query = ds.createQuery(Restaurante.class);
        for(Restaurante i: mostrarRestaurante()){
            UpdateOperations xx = ds.createUpdateOperations(Restaurante.class).set("c4", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCR5 (int cal){
        Query<Restaurante> query = ds.createQuery(Restaurante.class);
        for(Restaurante i: mostrarRestaurante()){
            UpdateOperations xx = ds.createUpdateOperations(Restaurante.class).set("c5", cal);
            ds.update(query, xx, false);
        }
    }
    
     public void updateCalR (int cal){
        Query<Restaurante> query = ds.createQuery(Restaurante.class);
        for(Restaurante i: mostrarRestaurante()){
            UpdateOperations xx = ds.createUpdateOperations(Restaurante.class).set("calificacion", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCL1 (int cal){
        Query<LugarT> query = ds.createQuery(LugarT.class);
        for(LugarT i: mostrarLugares()){
            UpdateOperations xx = ds.createUpdateOperations(LugarT.class).set("c1", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCL2 (int cal){
        Query<LugarT> query = ds.createQuery(LugarT.class);
        for(LugarT i: mostrarLugares()){
            UpdateOperations xx = ds.createUpdateOperations(LugarT.class).set("c2", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCL3 (int cal){
        Query<LugarT> query = ds.createQuery(LugarT.class);
        for(LugarT i: mostrarLugares()){
            UpdateOperations xx = ds.createUpdateOperations(LugarT.class).set("c3", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCL4 (int cal){
        Query<LugarT> query = ds.createQuery(LugarT.class);
        for(LugarT i: mostrarLugares()){
            UpdateOperations xx = ds.createUpdateOperations(LugarT.class).set("c4", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCL5 (int cal){
        Query<LugarT> query = ds.createQuery(LugarT.class);
        for(LugarT i: mostrarLugares()){
            UpdateOperations xx = ds.createUpdateOperations(LugarT.class).set("c5", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void updateCalL (int cal){
        Query<LugarT> query = ds.createQuery(LugarT.class);
        for(LugarT i: mostrarLugares()){
            UpdateOperations xx = ds.createUpdateOperations(LugarT.class).set("calificacion", cal);
            ds.update(query, xx, false);
        }
    }
    
    public void eliminarEvento(Evento ev){
        ds.delete(ev);
    }
}
