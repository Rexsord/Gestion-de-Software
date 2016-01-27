package datos;

public class Cliente extends Persona {
	
	//Atributos
	private int cantProyectos;
	
	//Get y set
	public int getCantProyecto(){
		return cantProyectos;
	}
	
	//Constructores
	public Cliente() {
		
		super();
	}
	
	public Cliente(String num,String nom,String sex, String dire, int cant) {
		
		super(num, nom, sex, dire);
		cantProyectos = cant;
		
	}

}
