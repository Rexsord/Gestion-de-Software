package datos;

public class Contrato {
	
	//Atributos
	private int id;
	private String numIdentificacion;
	private String nomProyecto;
	private String fechaIni;
	private String fechaFin;
	
	//Get y set
	public int getid(){
		return id;
	}
	
	public void setId(int Id){
		id = Id;
	}
	
	public String getNum(){
		return numIdentificacion;
	}
	
	public void setNum(String num){
		numIdentificacion = num;
	}
	
	public String getNom(){
		return nomProyecto;
	}
	
	public void setNom(String nom){
		nomProyecto = nom;
	}
	
	public String getFechaIni(){
		return fechaIni;
	}
	
	public void setFechaIni(String ini){
		fechaIni = ini;
	}
	
	public String getFechaFin(){
		return fechaFin;
	}
	
	public void setFechaFin(String fin){
		fechaFin = fin;
	}
	
	//Constructores
	public Contrato() {
		
	}
	
	public Contrato(int Id, String num, String nom, String ini, String fin) {
		id = Id;
		numIdentificacion = num;
		nomProyecto = nom;
		fechaIni = ini;
		fechaFin = fin;
	}

}
