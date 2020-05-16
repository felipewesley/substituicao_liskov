package program.pack;

public class Funcionario {
	
	public Integer matricula; 
	public String nome; 
	public String setor; 
	public Float salario; 
	
	public void setSalario(Float salario, Float bonus) {
		this.salario = salario + (salario/100) * bonus; 
	}
	
	public String getNivel() {
		return ""; 
	}

	public void setNivel(String nivel) throws Exception {
		
	}
	
}