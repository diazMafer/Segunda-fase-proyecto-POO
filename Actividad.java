/**
    * Modela las caracteristicas principales de una actividad turistica
    * 
    
    @author María Fernanda López, Francisco Molina
    @version 11/08/2017
    
*/

public class Actividad extends Lugar{
	//Atributos
	private String tipo;
	private String horario;

	//Constructor
	public Actividad(String nombre, String direccion, String departamento, String descripcion, double calificacion, int c1, int c2, int c3, int c4, int c5, String horario, String tipo){
            super(nombre, direccion, departamento, descripcion, calificacion, c1, c2, c3, c4, c5);
            this.horario=horario;
            this.tipo=tipo;
            
	}

	//gets

	public String getTipo(){
		return tipo;
	}
	
        
        public String getHorario(){
            return horario;
        }
        
        @Override
        public String toString() {
			String msj = "Nombre: " + getNombre() + "\nDireccion: " + getDireccion();
			String msj2 = "Tipo: " + getTipo() ;
			String descrip= "Horario: " + getHorario();
			String direc = "Departamento: " + getDepa();
			String msjCompleto= msj+ "\n" + msj2+ "\n" + descrip+"\n"+direc;
			return msjCompleto;
		}
}
