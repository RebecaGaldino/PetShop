package petshopfiles;


public class Animal {
	private String  codClienteResponsavel;
	private String cod;
	private String idCuidador;
	private String raca;
	private int idade;
	private double peso;





	public Animal(String raca, int idade,  double peso, String codClienteResponsavel, String cod, String idCuidador ) {
		setRaca(raca);
		setIdade(idade);
		setPeso(peso);
		setCod(cod);
	}
	
	
	public String getIdCuidador() {
		return idCuidador;
	}

	public void setIdCuidador(String id) {
		this.idCuidador = id;
	}

	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getCodClienteResponsavel() {
		return codClienteResponsavel;
	}


	public void setCodClienteResponsavel(String codClienteResponsavel) {
		this.codClienteResponsavel = codClienteResponsavel;
	}

	public String toString(){
		return "Codigo do animal: " + getCod() +
				"Cod. cliente responsavel: " + getCodClienteResponsavel() + 
				" Cuidador: " + getIdCuidador() +
				"Raca: " + getRaca() + 
				"Idade: " + getIdade() +
			"Peso: " + getPeso();
	}
}
