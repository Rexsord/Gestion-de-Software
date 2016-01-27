package datos;

public class Persona {
	
	//Atributos
	private String numIdentificacion;
	private String nombre;
	private String sexo;
	private String direccion;
	
	//Get y Set
	public String getNumIdentificador()
	{
		return numIdentificacion;
	}
	
	public void setNumIdentificador(String num)
	{
		numIdentificacion = num;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nom)
	{
		nombre = nom;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	public void setSexo(String sex)
	{
		sexo = sex;
	}
	
	public String getDireccion()
	{
		return direccion;
	}
	
	public void setDireccion(String dire)
	{
		direccion = dire;
	}
	
	//Constructores
	
	public Persona(){
		
	}
	
	public Persona(String num,String nom,String sex, String dire){
		numIdentificacion = num;
		nombre = nom;
		sexo = sex;
		direccion = dire;
	}

}
