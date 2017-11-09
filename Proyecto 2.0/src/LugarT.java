/**
    * Modela las caracteristicas principales para poder un lugar turistico 
    * 
    * @author María Fernanda López, Francisco Molina
    * @version 13/09/2017
    
*/

public class LugarT extends Lugar{
	//Atributos 
	private String horario;

	
        /**
         * Constructor for objects of class LugarT
         * @param nombre
         * @param descripcion
         * @param horario
         * @param departamento 
         */
	public LugarT(String nombre, String direccion, String departamento, String descripcion, double calificacion, int c1, int c2, int c3, int c4, int c5, String horario){
            super(nombre, direccion, departamento, descripcion, calificacion, c1, c2, c3, c4, c5);
            this.horario=horario;
	}

        /**
         * Metodo para obtener el horario del lugar turistico
         * @return horario del lugar
         */
        public String getHorario(){
		return horario;
	}
        public String getDepartamento(){
            return departamento;
        }
        
}