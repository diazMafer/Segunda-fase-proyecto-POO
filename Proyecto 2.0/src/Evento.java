
import java.util.Date;
import org.mongodb.morphia.annotations.Embedded;

/**
* Modela las caracteristicas principales para poder realizar y promocionar un evento 
*@author María Fernanda López, Francisco Molina
*@version 11/08/2017
    
*/
@Embedded 
public class Evento{
	//Atributos 
	private String nombre;
	private String tipo;
	private String lugar;
	private String descripcion; 
	private String horario; 
	private String departamento;
        private Date fecha;

	/**
         * Constructor for objects of class Evento
         * @param nombre
         * @param tipo
         * @param lugar
         * @param descripcion
         * @param horario
         * @param departamento 
         */
	public Evento(String nombre, String tipo, String lugar, String descripcion, String horario, String departamento, Date fecha){
		this.nombre = nombre;
		this.tipo = tipo;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.horario = horario;
		this.departamento=departamento;
                this.fecha=fecha;
	}

	//gets 
        
        /**
         * @return nombre del evento
         */

	public String getNombre(){
		return nombre;
	}
        
        /**
         * @return tipo del evento
         */
	public String getTipo(){
		return tipo;
	}
        
        /**
         * @return lugar del evento
         */

	public String getLugar(){
		return lugar;
	}
        
        /**
         * @return descripcion del evento
         */
	public String getDescripcion(){
		return descripcion;
	}
        
        /**
         * @return horario del evento
         */

	public String getHorario(){
		return horario;
	}
	
        /**
         * @return departamento en el que se realizara el evento
         */
	public String getDepartamento(){
		return departamento;
	}
        
        public Date getFecha(){
            return fecha;
        }
        
        @Override
        public String toString() {
            String msj = "Nombre: " + getNombre() + "\nDireccion: " + getLugar();
            String msj2 = "Tipo: " + getTipo() ;
            String descrip= "Descripcion: " + getDescripcion() + "\nHorario: " + getHorario();
            String direc = "Departamento: " + getDepartamento();
            String msjCompleto= msj+ "\n" + msj2+ "\n" + descrip+"\n"+direc;
            return msjCompleto;
        }
	
	

}
