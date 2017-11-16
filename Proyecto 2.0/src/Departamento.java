/**
    * Modela las caracteristicas de un departamento y su actividad turistica
    * 
    
    @author María Fernanda López, Francisco Molina
    @version 11/08/2017
    
*/

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Departamento{
    //Atributos
    private String nombre;
    private List<Lugar> lugares;
    private List<Evento> eventos;
    private Conectar cc;
    
    public Departamento(){
        lugares = new ArrayList<Lugar>();
        cc = new Conectar();
        
        //Se guarda un poco de información de los lugares turisticos para el programa ya inicie con ellos
            
            Hotel h1 = new Hotel("Hote","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");
            cc.addHotel(h1);
            Hotel h2 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");            
            cc.addHotel(h2);
            Hotel h3 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");           
            cc.addHotel(h3);
            Hotel h4 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");           
            cc.addHotel(h4);
            Hotel h5 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");           
            cc.addHotel(h5);
            Hotel h6 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");           
            cc.addHotel(h6);
            Restaurante r1 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r2 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r3 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r4 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r5 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");           
            cc.addRestaurante(r1);
            cc.addRestaurante(r2);
            cc.addRestaurante(r3);
            cc.addRestaurante(r4);            
            cc.addRestaurante(r5);
            LugarT l1 = new LugarT("nombre lugar","address","Guate", "construccion",0.0,0,0,0, 0, 0, "6-8pm");           
            cc.addLugar(l1);
            
    }
    
    public ArrayList<String> nombresHoteles(String departamento){
        List<Hotel> hoteles = cc.mostrarHoteles();
        Iterator<Hotel> it = hoteles.iterator();
        ArrayList<String> nombres = new ArrayList<String>();
        while(it.hasNext()){
            Hotel hotel = it.next();
            String depas = hotel.getDepartamento();
            //se verifica si depas tiene en us contenido el departamento buscado
            if(depas.indexOf(departamento)!= -1){
                nombres.add(hotel.getNombre());
            }
        }
        
        return nombres;
                
    }
    
     public ArrayList<String> nombresActividades(String departamento){
        List<Actividad> actividades = cc.mostrarActs();
        Iterator<Actividad> it = actividades.iterator();
        ArrayList<String> nombres = new ArrayList<String>();
        while(it.hasNext()){
            Actividad acts = it.next();
            String depas = acts.getDepa();
            //se verifica si depas tiene en us contenido el departamento buscado
            if(depas.indexOf(departamento)!= -1){
                nombres.add(acts.getNombre());
            }
        }
        
        return nombres;
                
    }
     
     public ArrayList<String> nombresRestaurantes(String departamento){
        ArrayList<String> nombres = new ArrayList<String>();
        for(Restaurante r: cc.mostrarRestaurante()){
            if(r.getDepa().equals(departamento)){
                nombres.add(r.getNombre());
            }
        }
        return nombres;
     }
     
     public ArrayList<String> nombresEvento(String departamento){
        ArrayList<String> nombres = new ArrayList<String>();
        for(Evento r: cc.mostrarEventos()){
            if(r.getDepartamento().equals(departamento)){
                nombres.add(r.getNombre());
            }
        }
        return nombres;
     }
     
     public ArrayList<String> nombresLugarT(String departamento){
        ArrayList<String> nombres = new ArrayList<String>();
        for(LugarT r: cc.mostrarLugares()){
            if(r.getDepa().equals(departamento)){
                nombres.add(r.getNombre());
            }
        }
        return nombres;
     }
     
    public String infoHotel(String nombre){
    	Iterator<Hotel> it = cc.mostrarHoteles().iterator();
        String datos="";
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(hotel.getNombre().equals(nombre)){
    			datos = hotel.toString();
    		}
    	}
    	        
        return datos;
    }
    
    /**
     * metodo para buscar la inforamcion de un evento
     * @param nombre
     * @return datos del evento
     */      
    public String infoEvento(String nombre){
    	Iterator<Evento> it = cc.mostrarEventos().iterator();
        String datos="";
    	while(it.hasNext()){
    		Evento evento = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(evento.getNombre().equals(nombre)){
    			datos = evento.toString();
    		}
    	}
    	        
        return datos;
    }
    
    /**
     * metodo para buscar la informacion de actividades
     * @param nombre
     * @return datos de la actividad
     */ 
     public String infoActividad(String nombre){
    	Iterator<Actividad> it = cc.mostrarActs().iterator();
        String datos="";
    	while(it.hasNext()){
    		Actividad act = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(act.getNombre().equals(nombre)){
    			datos = act.toString();
    		}
    	}
    	        
        return datos;
    }
   
     /**
     * metodo para buscar la informacion del restaurante
     * @param nombre
     * @return datos del restaurante
     */
    public String infoRes(String nombre){
    	Iterator<Restaurante> it = cc.mostrarRestaurante().iterator();
        String datos="";
    	while(it.hasNext()){
    		Restaurante res = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(res.getNombre().equals(nombre)){
    			datos = res.toString();
    		}
    	}
    	        
        return datos;
    }
    
    /**
    * metodo para buscar la informacion de un lugar
    * @param nombre
    * @return datos del lugar
    */
     public String infoLugar(String nombre){
    	Iterator<LugarT> it = cc.mostrarLugares().iterator();
        String datos="";
    	while(it.hasNext()){
    		LugarT lugares = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(lugares.getNombre().equals(nombre)){
    			datos = lugares.toString();
    		}
    	}
    	        
        return datos;
    }
     
    /**
     * Ordena el arreglo de hoteles por el que tiene calificacion más alta al que tiene calificacion mas baja
     * @return arreglo de la clase hotels
     */
     
     public Hotel[] convertiH (){
         Iterator<Hotel> it = cc.mostrarHoteles().iterator();
         int x = cc.mostrarHoteles().size();
         int y = 0;
         Hotel[] hoteles = new Hotel[x];
         while(it.hasNext()){
             Hotel hotel = it.next();
             for(int i=0; i<cc.mostrarHoteles().size();i++){
                hoteles[i] = cc.mostrarHoteles().get(i);
                y = hoteles.length;
             
         }
         }
         
         Hotel temp;
        //ordenar
        for (int i=0; i<y; i++){
            for (int j = i+1; j<y; j++){
                if(hoteles[i].getCalificacion() < hoteles[j].getCalificacion() ){
                    temp = hoteles[i];
                    hoteles[i] = hoteles[j];
                    hoteles[j] = temp;
                            
                }
            }
        }
        return hoteles;
         
     }
     
   /**
      * Ordena el arrelgo de restaurantes por el que tiene mayor calificacion hasta el qe tiene menor
      * @return arreglo de tipo restaurante 
      */
     
   public Restaurante[] convertirR (){
         Iterator<Restaurante> it = cc.mostrarRestaurante().iterator();
         int x = cc.mostrarRestaurante().size();
         int y = 0;
         Restaurante[] res = new Restaurante[x];
         while(it.hasNext()){
             Restaurante rest = it.next();
             for(int i=0; i<cc.mostrarRestaurante().size();i++){
                res[i] = cc.mostrarRestaurante().get(i);
                y = res.length;
             
         }
         }
         
        Restaurante temp;
        //ordenar
        for (int i=0; i<y; i++){
            for (int j = i+1; j<y; j++){
                if(res[i].getCalificacion() < res[j].getCalificacion() ){
                    temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                            
                }
            }
        }
        return res;
         
     }
  
   /**
    * ordena el arreglo de lugares turistico por el que tiene mayor calificación hasa el que tiene menor
    * @return arreglo de tipo lugares turisticos ordenado
    */
  public LugarT[] convertirL (){
         Iterator<LugarT> it = cc.mostrarLugares().iterator();
         int x = cc.mostrarLugares().size();
         int y = 0;
         LugarT[] lugares = new LugarT[x];
         while(it.hasNext()){
             LugarT lu = it.next();
             for(int i=0; i<cc.mostrarLugares().size();i++){
                lugares[i] = cc.mostrarLugares().get(i);
                y = lugares.length;
             
         }
         }
         
        LugarT temp;
        //ordenar
        for (int i=0; i<y; i++){
            for (int j = i+1; j<y; j++){
                if(lugares[i].getCalificacion() < lugares[j].getCalificacion() ){
                    temp = lugares[i];
                    lugares[i] = lugares[j];
                    lugares[j] = temp;
                            
                }
            }
        }
        return lugares;
         
     }
     
    
   public int calificacionHBarra(String val, String nombre){
       int retorno = 0; 
       int cant = 0;
       for(Hotel cont: cc.mostrarHoteles()){
           if(val.equals("1")){
               if(cont.getNombre().equals(nombre)){
                   cont.addC1();
                   retorno = cont.getC1();
                   cc.updateCH1(retorno);
                   
                   
               }
           }
       }
       return retorno;
   } 

   public double calificacionHTotal(String nombre){
       double conteo = 0;
       for(Hotel cont: cc.mostrarHoteles()){
           if(cont.getNombre().equals(nombre)){
               conteo = cont.getC1()*1+cont.getC2()*2+cont.getC3()*3+cont.getC4()*4+cont.getC5()*5;
               
           }
       }
       return conteo;
   }
   
   /**
    * metodo que verifica si un evento esta vigente aun o no 
    */
   public void verificarFecha(){
       java.util.Date d = new java.util.Date();
       SimpleDateFormat plantilla = new SimpleDateFormat("dd/MM/yyyy");
       for(Evento ev: cc.mostrarEventos()){
           if((ev.getFecha().compareTo(d)) > 0){
               cc.eliminarEvento(ev);
           }
       }
   }
   
   
    
}






