package datos;

public class Trabajador extends Persona {
		
		//Atributos
		private int salario;
		private String nomProyecto;
		private String evaluacion;
		
		//Get y set
		public int getSalario(){
			return salario;
		}
		
		public void setSalario(int sal){
			salario = sal;
		}
		
		public String getNomProyecto(){
			return nomProyecto;
		}
		
		public void setNomProyecto(String nom){
			nomProyecto = nom;
		}
		
		public String getEvaluacion(){
			return evaluacion;
		}
		
		public void setEvaluacion(String eva){
			evaluacion = eva;
		}
		
		//Constructores
		public Trabajador()  {
			super();	
		}
		
		public Trabajador(String num,String nom,String sex, String dire, int sal, String nomPro,String eva){
			super(num, nom, sex, dire);
			salario = sal;
			nomProyecto = nomPro;
			evaluacion = eva;
			
		}

}
