package datos;

public class Programador extends Trabajador {
	
	//Atributos
	private String lenguajeProgramacion;
	
	//Get y set
	public String getLenguaje(){
		return lenguajeProgramacion;
	}
	
	public void setLenguaje(String lengua){
		lenguajeProgramacion = lengua;
	}
	
	//Constructores
	public Programador() {
		super();
	}
	
	public Programador(String num,String nom,String sex, String dire, int sal, String nomPro,String eva, String lengua) {
		super(num, nom, sex, dire, sal, nomPro, eva);
		lenguajeProgramacion = lengua;
	}

}
