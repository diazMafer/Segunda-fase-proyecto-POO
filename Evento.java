/**
    * Modela las caracteristicas principales para poder realizar y promocionar un evento 
    * 
    
    @author María Fernanda López, Francisco Molina
    @version 11/08/2017
    
*/

public class Evento{
	//Atributos 
	private String nombre;
	private String tipo;
	private String lugar;
	private String descripcion; 
	private String horario; 
	private String departamento;

	//Constructor 
	public Evento(String nombre, String tipo, String lugar, String descripcion, String horario, String departamento){
		this.nombre = nombre;
		this.tipo = tipo;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.horario = horario;
		this.departamento=departamento;
	}

	//gets 

	public String getNombre(){
		return nombre;
	}

	public String getTipo(){
		return tipo;
	}

	public String getLugar(){
		return lugar;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public String getHorario(){
		return horario;
	}
	
	public String getDepartamento(){
		return departamento;
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