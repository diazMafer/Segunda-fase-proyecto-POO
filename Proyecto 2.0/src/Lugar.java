
/**
 * Modela las caracteristica de un lugar al cual una turista puede viajar 
 * @author Maria Fernanda Lopez 17160
 * @author Francisco Molina 17050
 * @version 19/10/2017
 */
public class Lugar {
    //Atributos
    protected String nombre;
    protected String direccion;
    protected String departamento;
    protected double calificacion;
    protected int c1;
    protected int c2;
    protected int c3;
    protected int c4;
    protected int c5;
    protected String descripcion;
    
    /**
     * Constructor for objects of class Lugar
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
     */
    public Lugar(String nombre, String direccion, String departamento, String descripcion, double calificacion, int c1, int c2, int c3, int c4, int c5){
        this.nombre=nombre;
	this.descripcion=descripcion;
	this.direccion=direccion;
	this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
        this.c5=c5;
        this.departamento=departamento;
        this.calificacion=calificacion;
    }
    
    /**
         * Metodo para obtener la direccion del restaurante
	 * @return: retorna direccion de restaurante.
	 */
        public void setCalificacion(double val){
            calificacion=val;
        }
        
        /**
         * Metodo para obtener la calificacion
         * @return calificacion total del departamento
         */
        public double getCalificacion(){
            return calificacion;
        }
        public int getC1(){            
            return c1;
        }
        public void addC1(){
            c1 +=1;        
        }
        public int getC2(){
            return c2;
        }
        public void addC2(){
            c2 +=1;
        
        }
        public int getC3(){
            return c3;
        }
        public void addC3(){
            c3+=1;
        
        }
        public int getC4(){
            return c4;
        }   
        public void addC4(){
            c4 +=1;
        }
        public int getC5(){
            return c5;
        }
        public void addC5(){
            c5 +=1;
        
        }

        /**
         * metodo para obtener la direccion del departamento
         * @return direccion del lugar
         */
	public String getDireccion() {
		return direccion;
	}
        
	/**
         * Metodo para obtener el nombre del lugar
	 * @return: retorna nombre de lugar
	 */
	public String getNombre() {
		return nombre;
	}
                	
	/**
         * Metodo para obtener la descripcion del lugar
	 * @return: retorna descripcion del lugar
	 */
	public String getDescripcion() {
		return descripcion;
	}
        	        
        /**
         * Metodo para obtener el departamento en el que se encuentra el lugar
         * @return departamento en el que se encuentra el lugar
         */
	public String getDepa(){
		return departamento;
	}
        
        /**
         * Metodo para obtener toda la informacion del lugar
         * @return informacion completa del lugar
         */
    @Override
	public String toString() {
		String msj = "Nombre: " + getNombre() + " Direccion: " + getDireccion();
		String descrip= "Descripcion: " + getDescripcion() + "\n";
		String msjCompleto= msj+ "\n"  + descrip;
		return msjCompleto;
	}
        
    
    
    
    
}
