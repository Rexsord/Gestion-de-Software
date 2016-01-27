package datos;

public class Planificador extends Trabajador{
	
	//Atributos
	private int cantDias;
	
	//Get y set
	public int getCantDias(){
		return cantDias;
	}
	
	public void setCantDias(int cant){
		cantDias = cant;
	}

	//Constructores
	public Planificador() {
		super();
	}
	
	public Planificador(String num,String nom,String sex, String dire, int sal, String nomPro,String eva, int cant) {
		super(num, nom, sex, dire, sal, nomPro, eva);
		cantDias = cant;
	}

}
