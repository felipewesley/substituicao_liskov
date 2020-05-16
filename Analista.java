package program.pack;

import java.security.InvalidParameterException;

public class Analista extends Funcionario {
	
	private String nivel;

	@Override
	public String getNivel() {
		return "Analista "+nivel;
	}

	@Override
	public void setNivel(String nivel) throws Exception {
		if ((nivel == "JR") || (nivel == "PL") || (nivel == "SR")) {
			this.nivel = nivel;
		} else {
			throw new InvalidParameterException("O nivel informado para o analista é invalido."); 
		}
	}	
	
}