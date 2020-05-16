package program.pack;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		Funcionario funcGerente = new Gerente(); 
		funcGerente.nome = "Felipe";
		funcGerente.setor = "Informatica"; 
		funcGerente.setSalario(4100F,0F);
		
		Funcionario funcAnalista = new Analista();
		funcAnalista.nome = "Wesley"; 
		funcAnalista.setNivel("PL");
		funcAnalista.setSalario(2700F,0F);
		
		System.out.println(funcGerente.toString()+": "+funcGerente.nome+" | R$ "+funcGerente.salario);
		System.out.println(funcAnalista.nome+" é "+funcAnalista.getNivel()+" | R$ "+funcAnalista.salario);
		
	}

}
