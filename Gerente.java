package program.pack;

public class Gerente extends Funcionario {
	
	public String numero_cartao; 
	
	@Override
	public String toString() {
		return getClass().getName() + " de " + this.setor; 
	}
	
	@Override
	public void setSalario(Float salario, Float bonus) {
		this.salario = (salario * 1.1F) + (salario/100) * bonus; 
	}

}