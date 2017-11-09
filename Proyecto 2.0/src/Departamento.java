/**
    * Modela las caracteristicas de un departamento y su actividad turistica
    * 
    
    @author María Fernanda López, Francisco Molina
    @version 11/08/2017
    
*/

import java.util.ArrayList;
import java.util.Iterator;


public class Departamento{
    //Atributos
	private String nombre;
        private Hotel miH;
	private ArrayList<Hotel> hotelitos;
	private ArrayList<Restaurante> restaurante;
	private ArrayList<Actividad> actividad; 
	private ArrayList<Evento> evento; 
	private ArrayList<LugarT> lugar;
        
        /**
         * Constructor for objects of class Departamento
         */
                
        public Departamento(){
            hotelitos = new ArrayList<>();
            restaurante = new ArrayList<>();
            actividad = new ArrayList<>();
            evento = new ArrayList<>();
            lugar = new ArrayList<>();
            
            
            Hotel h1 = new Hotel("Hote","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");
            hotelitos.add(h1);
            Hotel h2 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");
            hotelitos.add(h2);
            Hotel h3 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");
            hotelitos.add(h3);
            Hotel h4 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");
            hotelitos.add(h4);
            Hotel h5 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");
            hotelitos.add(h5);
            Hotel h6 = new Hotel("Hote2","12 Av Zona 1.","Guatemala","descripcion",0.0, 0, 0, 0, 0, 0, "telefono: 223332","estecorreonoesfalso@gmail.com");
            hotelitos.add(h6);
            Restaurante r1 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r2 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r3 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r4 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            Restaurante r5 = new Restaurante("restaurante cool", "dasdsa","Guatemala","sads", 0.0, 0, 0, 0, 0, 0,"7-14","telefono: 55");
            restaurante.add(r2);
            restaurante.add(r3);
            restaurante.add(r4);
            restaurante.add(r5);
            LugarT l1 = new LugarT("nombre lugar","address","Guate", "construccion",0.0,0,0,0, 0, 0, "6-8pm");
            lugar.add(l1);
            
            
            
        }

        
   /**
    *realiza la busqueda por tipo de una actividad, verifica si existe o no.
    *Si existe le muestra todos los datos al usuario de lo contrario tira error.
    *@param departamento actividad
    */

    public String busquerAct(String departamento){
    	Iterator<Actividad> it = actividad.iterator();
        String datos = "";
    	ArrayList<Actividad> coleccion = new ArrayList<Actividad>();//acts con el tipo
    	while(it.hasNext()){
    		Actividad actividades = it.next();
    		String tipos = actividades.getTipo();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(tipos.indexOf(departamento)!= -1){
    			coleccion.add(actividades);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    
    /**
     * Calcula cuantas veces se ha calificacado el hotel con 1, 2, 3, 4, 5
     * @param val
     * @param nombre
     * @return retorna la cantidad de la calificacion que se le ha puesto al hotel
     */
    public int calificacionHBarra(String val,String nombre){
        int retorno=0;
        for (Hotel cont: hotelitos) {
            if (val.equals("1")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC1();
                    retorno =cont.getC1();
                }
        
            } else if (val.equals("2")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC2();
                    retorno =cont.getC2();
                
                }
            } else if (val.equals("3")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC3();
                    retorno =cont.getC3();   
                }
            } else if (val.equals("4")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC4();
                    retorno =cont.getC4();   
                }
            } else if (val.equals("5")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC5();
                    retorno =cont.getC5();   
                }
            }
        
        }
        return retorno;
    }
    
    /**
     * Calcu la calificacion total de un hotel
     * @param nombre
     * @return calificacion total del hotel
     */

    public double calificacionHTotal(String nombre){
        double conteoT=0;
        for(Hotel cont: hotelitos){
            if(cont.getNombre().equals(nombre)){
                conteoT=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
            } 
        }
        return conteoT;
    }
    
    /**
     * devuelve la cantidad de 1,2,3,4,5 con los que fue calificado un hotel
     * @param nombre
     * @return 
     */
    public int[] cantidadCH(String nombre){
        int vec[]=new int[5];
        for(Hotel cont: hotelitos){
            if(cont.getNombre().equals(nombre)){
                vec[0]=cont.getC1();
                vec[1]=cont.getC2();
                vec[2]=cont.getC3();
                vec[3]=cont.getC4();
                vec[4]=cont.getC5(); 
            }
        }
        return vec;
    }
    
    /**
     * calcula la calificacion real de un hotel 
     * ya multiplicandolo por sus debidas cantidas las veces que fue calificado con 1,2,3,4 y 5
     * @param nombre
     * @return 
     */
    public double calificacionH(String nombre) {
            double calificacionReal=0;
            double numero=0;
		for (Hotel cont: hotelitos) {
			if(cont.getNombre().equals(nombre)) {
                            numero=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
                            calificacionReal=(cont.getC1()*1+cont.getC2()*2+cont.getC3()*3+cont.getC4()*4+cont.getC5()*5)/numero;
                            cont.setCalificacion(calificacionReal);
			}
		}
                return calificacionReal;
	}
    
    /**
     * realiza un conteo de cuantas veces se ha calificado con 1,2,3,4 o 5 un restaurante
     * @param val
     * @param nombre
     * @return 
     */
    public int calificacionRBarra(String val,String nombre){
        int retorno=0;
        for (Restaurante cont: restaurante) {
            if (val.equals("1")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC1();
                    retorno =cont.getC1();
                }
        
            } else if (val.equals("2")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC2();
                    retorno =cont.getC2();
                
                }
            } else if (val.equals("3")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC3();
                    retorno =cont.getC3();   
                }
            } else if (val.equals("4")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC4();
                    retorno =cont.getC4();   
                }
            } else if (val.equals("5")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC5();
                    retorno =cont.getC5();   
                }
            }
        
        }
        return retorno;
    }
    
    /**
     * retorna todas las cantidades de 1,2,3,4,5 con las que ha sido calificado un restaurante
     * @param nombre
     * @return vector con las cantidades de calificaciones
     */
    public int[] cantidadCR(String nombre){
        int vec[]=new int[5];
        for(Restaurante cont: restaurante){
            if(cont.getNombre().equals(nombre)){
                vec[0]=cont.getC1();
                vec[1]=cont.getC2();
                vec[2]=cont.getC3();
                vec[3]=cont.getC4();
                vec[4]=cont.getC5(); 
            }
        }
        return vec;
    }
    
    /**
     * metodo para calcular la calificacion real del restaurante 
     * se hace un promedio de las calificaciones individuales que se le han ido dando
     * @param nombre
     * @return calificacion total
     */
    public double calificacionR(String nombre) {
        double calificacionReal=0;
        double numero=0;
        for (Restaurante cont: restaurante) {
            if(cont.getNombre().equals(nombre)) {
                numero=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
                calificacionReal=(cont.getC1()*1+cont.getC2()*2+cont.getC3()*3+cont.getC4()*4+cont.getC5()*5)/numero;
                cont.setCalificacion(calificacionReal);
		}
		}
                return calificacionReal;
	}
    
    /**
     * metodo para contabilizar cuantas veces se ha calificado un restaurante
     * @param nombre
     * @return numero de calificacion
     */
    public double calificacionRTotal(String nombre){
        double conteoT=0;
        for(Hotel cont: hotelitos){
            if(cont.getNombre().equals(nombre)){
                conteoT=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
            }
        }
        return conteoT;
    }
    
    /**
     * contabiliza la cantidad de 1,2,3,4 o5 que se le han dado a un lugar turistico 
     * a la hora de calificarlo
     * @param val
     * @param nombre
     * @return contidad de 1,2,3,4 o 5
     */
    public int calificacionLBarra(String val,String nombre){
        int retorno=0;
        for (LugarT cont: lugar) {
            if (val.equals("1")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC1();
                    retorno =cont.getC1();
                }
        
            } else if (val.equals("2")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC2();
                    retorno =cont.getC2();
                
                }
            } else if (val.equals("3")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC3();
                    retorno =cont.getC3();   
                }
            } else if (val.equals("4")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC4();
                    retorno =cont.getC4();   
                }
            } else if (val.equals("5")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC5();
                    retorno =cont.getC5();   
                }
            }
        
        }
        return retorno;
    }
    
    /**
     * metodo para calcular la calificacion real de un lugar 
     * multiplica por 1,2,3,,4 o 5 la cantidad de esos debidos numeros de calificacion 
     * los divide entre el numero total de veces que se ha calificado el lugar
     * @param nombre
     * @return 
     */
    public double calificacionL(String nombre) {
        double calificacionReal=0;
        double numero=0;
        for (LugarT cont: lugar) {
            if(cont.getNombre().equals(nombre)) {
                numero=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
                calificacionReal=(cont.getC1()*1+cont.getC2()*2+cont.getC3()*3+cont.getC4()*4+cont.getC5()*5)/numero;
                cont.setCalificacion(calificacionReal);

            }
		}
                return calificacionReal;
	}
    
    /**
     * metodo para guardar el numero de 1,2,3,4 y 5 que se ha calificado un lugar turistico
     * @param nombre
     * @return vector de con las cantidades totales
     */
     public int[] cantidadCL(String nombre){
        int vec[]=new int[5];
        for(LugarT cont: lugar){
            if(cont.getNombre().equals(nombre)){
                vec[0]=cont.getC1();
                vec[1]=cont.getC2();
                vec[2]=cont.getC3();
                vec[3]=cont.getC4();
                vec[4]=cont.getC5(); 
            }
        }
        return vec;
    }
     
    /**
     * metodo para calcular el total de veces que se ha calificado un lugar 
     * @param nombre
     * @return veces que se ha calificado un lugar
     */
    public double calificacionLTotal(String nombre){
        double conteoT=0;
        for(LugarT cont: lugar){
            if(cont.getNombre().equals(nombre)){
                conteoT=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
            } 
        }
        return conteoT;
    }
    


    /**
     * Metodo para retornar una coleccion de hoteles que pertenecen a un departamento
     * @param departamento
     * @return un arraylist con los hoteles que pertenecen a ese departamento
     */    
    public String busquerHoteles(String departamento){
    	Iterator<Hotel> it = hotelitos.iterator();
        String datos="";
    	ArrayList<Hotel> coleccion = new ArrayList<Hotel>();//acts con el tipo
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		String depas = hotel.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(hotel);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    
    /**
     * metodo para buscar toda la informacion de un restuarante que pertence a un debido departamento
     * @param departamento
     * @return datos del restuarante
     */
    public String busquerRestaurante(String departamento){
    	Iterator<Restaurante> it = restaurante.iterator();
        String datos= "";
    	ArrayList<Restaurante> coleccion = new ArrayList<Restaurante>();//acts con el tipo
    	while(it.hasNext()){
    		Restaurante restaurante = it.next();
    		String depas = restaurante.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(restaurante);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    
    /**
     * metodo para buscar toda la informacion de un evento que se realizara en un debido departamento
     * @param departamento
     * @return datos del evento
     */
    public String busquerEvento(String departamento){
    	Iterator<Evento> it = evento.iterator();
        String datos="";
    	ArrayList<Evento> coleccion = new ArrayList<Evento>();//acts con el tipo
    	while(it.hasNext()){
    		Evento event = it.next();
    		String depas = event.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(event);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    
    /**
     * metodo para buscar un lugar turistico de un departamento
     * @param departamento
     * @return datos del lugar
     */
    public String busquerLugar(String departamento){
    	Iterator<LugarT> it = lugar.iterator();
        String datos = "";
    	ArrayList<LugarT> coleccion = new ArrayList<LugarT>();//lugares en el departamento
    	while(it.hasNext()){
    		LugarT lugares = it.next();
    		String depas = lugares.getDepartamento();
    		//se verifica si depas tiene en su contenido el departamento buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(lugares);
    		}
    	}
        
        for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
	
        
   
    
   /**
    * Metodo para buscar todos los nombre de los Hoteles de un determinado departamento
    * @param departamento
    * @return 
    */
     public ArrayList<Hotel> busquerNombreH(String departamento){
    	Iterator<Hotel> it = hotelitos.iterator();
    	ArrayList<Hotel> coleccion = new ArrayList<Hotel>();//acts con el tipo
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		String depas = hotel.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(hotel);
    		}
    	}
    	        
        return coleccion;
    }
     /**
    * Metodo para buscar todos los nombre de los Hoteles de un determinado departamento
    * @return arraylist de hoteles
    */
     public ArrayList<Hotel> getHotel(){
    	Iterator<Hotel> it = hotelitos.iterator();
    	ArrayList<Hotel> coleccion = new ArrayList<Hotel>();//acts con el tipo
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		String depas = hotel.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		
    			coleccion.add(hotel);
    		
    	}
    	        
        return coleccion;
    }
    
    /**
     * Metodo para encontrar todos los nombres de eventos de un departamento
     * @param departamento
     * @return arraylist de eventos
     */
     public ArrayList<Evento> buscarNombreE(String departamento){
    	Iterator<Evento> it = evento.iterator();
    	ArrayList<Evento> coleccion = new ArrayList<Evento>();//acts con el tipo
    	while(it.hasNext()){
    		Evento evento = it.next();
    		String depas = evento.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(evento);
    		}
    	}
    	        
        return coleccion;
    }
    
    /**
     * Metodo para buscar todos los nombres de actividad de un departamento
     * @param departamento
     * @return arraylist de actividades
     */
     public ArrayList<Actividad> buscarNombreA(String departamento){
    	Iterator<Actividad> it = actividad.iterator();
    	ArrayList<Actividad> coleccion = new ArrayList<Actividad>();//acts con el tipo
    	while(it.hasNext()){
    		Actividad acts = it.next();
    		String depas = acts.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(acts);
    		}
    	}
    	        
        return coleccion;
    }
    
    /**
     * Metodo para buscar todos los nombres de restaurantes de un departamento
     * @param departamento
     * @return arraylist con el restaurante encontrado
     */
     public ArrayList<Restaurante> buscarNombreR(String departamento){
    	Iterator<Restaurante> it = restaurante.iterator();
    	ArrayList<Restaurante> coleccion = new ArrayList<Restaurante>();//acts con el tipo
    	while(it.hasNext()){
    		Restaurante res = it.next();
    		String depas = res.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(res);
    		}
    	}
    	        
        return coleccion;
    }
      /**
     * Metodo para buscar todos  restaurantes
     * @return  arraylist de todos los restaurantes
     */
     public ArrayList<Restaurante> getRes(){
    	Iterator<Restaurante> it = restaurante.iterator();
    	ArrayList<Restaurante> coleccion = new ArrayList<Restaurante>();//acts con el tipo
    	while(it.hasNext()){
    		Restaurante res = it.next();
    		String depas = res.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		
    			coleccion.add(res);
    		
    	}
    	        
        return coleccion;
    }
     
    /**
     * metodo para buscar el nombre de todos los lugares turisticos de un departamento
     * @param departamento
     * @return arraylist con lugares turisticos
     */
     public ArrayList<LugarT> buscarNombreL(String departamento){
    	Iterator<LugarT> it = lugar.iterator();
    	ArrayList<LugarT> coleccion = new ArrayList<LugarT>();//acts con el tipo
    	while(it.hasNext()){
    		LugarT lugar = it.next();
    		String depas = lugar.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(lugar);
    		}
    	}
    	        
        return coleccion;
    }
     
    /**
     * metodo para buscar todos los lugares
     * @return arraylist de lugares
     */
     public ArrayList<LugarT> getLugar(){
    	Iterator<LugarT> it = lugar.iterator();
    	ArrayList<LugarT> coleccion = new ArrayList<LugarT>();//acts con el tipo
    	while(it.hasNext()){
    		LugarT lugar = it.next();
    		
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		
    			coleccion.add(lugar);
    		
    	}
    	        
        return coleccion;
    }
     
         
     /**
      * Metodo para retornar toda la información de un hotel en especifico
      * @param nombre
      * @return datos del hotel
      */
      public String infoHotel(String nombre){
    	Iterator<Hotel> it = hotelitos.iterator();
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
    	Iterator<Evento> it = evento.iterator();
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
    	Iterator<Actividad> it = actividad.iterator();
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
    	Iterator<Restaurante> it = restaurante.iterator();
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
    	Iterator<LugarT> it = lugar.iterator();
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
         Iterator<Hotel> it = hotelitos.iterator();
         int x = hotelitos.size();
         int y = 0;
         Hotel[] hoteles = new Hotel[x];
         while(it.hasNext()){
             Hotel hotel = it.next();
             for(int i=0; i<hotelitos.size();i++){
                hoteles[i] = hotelitos.get(i);
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
         Iterator<Restaurante> it = restaurante.iterator();
         int x = restaurante.size();
         int y = 0;
         Restaurante[] res = new Restaurante[x];
         while(it.hasNext()){
             Restaurante rest = it.next();
             for(int i=0; i<restaurante.size();i++){
                res[i] = restaurante.get(i);
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
      
      public LugarT[] convertirL (){
         Iterator<LugarT> it = lugar.iterator();
         int x = lugar.size();
         int y = 0;
         LugarT[] lugares = new LugarT[x];
         while(it.hasNext()){
             LugarT lu = it.next();
             for(int i=0; i<lugar.size();i++){
                lugares[i] = lugar.get(i);
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
     
     
    
     
    
    
    
    
}






