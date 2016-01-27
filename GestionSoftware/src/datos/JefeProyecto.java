package datos;

public class JefeProyecto extends Trabajador{
	
	//Atributos
	private int cantProyectos;
	
	//Get y set
	public int getCantProyectos(){
		return cantProyectos;
	}
	
	public void setCantProyectos(int cant){
		cantProyectos = cant;
	}
	
	//Constructores
	public JefeProyecto() {
		super();
	}
	
	public JefeProyecto(String num,String nom,String sex, String dire, int sal, String nomPro,String eva, int cant) {
		super(num, nom, sex, dire, sal, nomPro, eva);
		cantProyectos = cant;
	}

}
